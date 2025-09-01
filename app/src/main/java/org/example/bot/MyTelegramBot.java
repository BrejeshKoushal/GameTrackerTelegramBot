package org.example.bot;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.example.entity.Game;
import org.example.entity.User;
import org.example.entity.UserGame;
import org.example.repository.GameRepository;
import org.example.repository.PriceAlertRepository;
import org.example.repository.UserGameRepository;
import org.example.repository.UserRepository;
import org.example.service.SteamPriceFetchService;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.commands.SetMyCommands;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.commands.scope.BotCommandScopeDefault;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
@Slf4j
public class MyTelegramBot extends TelegramLongPollingBot {
    private final PriceAlertRepository priceAlertRepository;
    private final UserService userService;
    private final BotCommands botCommands;
    private final String botUsername;
    private final UserRepository userRepository;
    private final GameRepository gameRepository;
    private final SteamPriceFetchService steamPriceFetchService;
    private final UserGameRepository userGameRepository;
    public MyTelegramBot(UserService userService,
                         BotCommands botCommands,
                         @Value("${telegram.bot.username}") String botUsername,
                         @Value("${telegram.bot.token}") String botToken, UserRepository userRepository, GameRepository gameRepository, SteamPriceFetchService steamPriceFetchService, UserGameRepository userGameRepository,
                         PriceAlertRepository priceAlertRepository) {
        super(botToken);
        this.userService = userService;
        this.botCommands = botCommands;
        this.botUsername = botUsername;
        this.userRepository = userRepository;
        this.gameRepository = gameRepository;
        this.steamPriceFetchService = steamPriceFetchService;
        this.userGameRepository = userGameRepository;

        log.info("Bot '{}' is being created.", this.botUsername);
        if (botToken == null || botToken.isBlank()) {
            log.error("CRITICAL ERROR: Bot token is EMPTY. Check your application.properties file.");
        }
        this.priceAlertRepository = priceAlertRepository;
    }
    @PostConstruct
    public void registerCommands() {
        log.info("Attempting to register bot command menu...");
        try {
            this.execute(new SetMyCommands(botCommands.getCommandList(), new BotCommandScopeDefault(), null));
            log.info("SUCCESS: Bot command menu was registered with Telegram.");
        } catch (TelegramApiException e) {
            log.error("FAILED to register bot commands: {}", e.getMessage());
        }
    }

    @Override
    public String getBotUsername() {
        return this.botUsername;
    }

    @Override
    public void onUpdateReceived(Update update) {
        log.debug("Received an update: {}", update);

        if (update.hasMessage() && update.getMessage().hasText()){
            String messageText = update.getMessage().getText();
            long chatId = update.getMessage().getChatId();

            if (messageText.startsWith("/")){
                String command = messageText.split(" ")[0].toLowerCase();
                log.info("Received command '{}' from chat_id {}", command, chatId);

                switch (command) {
                    case "/start":
                        showCommands(chatId);
                        break;

                    case "/register":
                        handleRegisterCommand(chatId, messageText);
                        break;

                    case "/setalert":
                        sendMessage(chatId,
                                "To set an alert, use:\n" +
                                        "/steam <Game Name> <Target Price>\n" +
                                        "/epic <Game Name> <Target Price>");
                        break;

                    case "/steam":
                        handleSteamAlert(chatId, messageText);
                        break;

                    case "/myalerts":
                        handleMyAlerts(chatId);
                        break;
                    case "/deletealert":
                        handleDeleteAlert(chatId,messageText);
                        break;
                    default:
                        sendMessage(chatId, "Sorry, I don't recognize that command.");
                        break;
                }

            } else {
                sendMessage(chatId,"Please use a valid command.");
            }
        }
    }
    // In MyTelegramBot.java

    private void handleMyAlerts(long chatId) {
        List<UserGame> userGames = userGameRepository.findByUserChatId(chatId);
        if (userGames.isEmpty()) {
            sendMessage(chatId, "You have no active alerts set.");
        } else {
            StringBuilder response = new StringBuilder("Here are the games you are tracking:\n\n");
            for (UserGame userGame : userGames) {
                String gameName = userGame.getGame().getGameName();
                BigDecimal desiredPrice = userGame.getDesiredPrice();
                // Append each game to the list
                response.append("• ").append(gameName).append(": ").append(desiredPrice).append("\n");
            }
            sendMessage(chatId, response.toString());
        }
    }

    private void handleDeleteAlert(long chatId, String messageText) {
        String[] parts = messageText.split(" ", 2);
        if (parts.length < 2) {
            sendMessage(chatId, "Usage: /deletealert <Game Name>");
            return;
        }

        String gameName = parts[1].trim();

        Game game = gameRepository.findByGameNameIgnoreCase(gameName)
                .orElse(null);

        if (game == null) {
            sendMessage(chatId, "No such game found: " + gameName);
            return;
        }

        // CHANGE THIS LINE: Use the correct repository
        int deleted = userGameRepository.deleteByUserChatIdAndGame(chatId, game);

        if (deleted > 0) {
            sendMessage(chatId, "Deleted all alerts for " + game.getGameName());
        } else {
            sendMessage(chatId, "No alerts found for " + game.getGameName());
        }
    }
    private void handleSteamAlert(long chatId, String messageText) {
        String[] parts = messageText.split(" ", 2);
        if (parts.length < 2) {
            sendMessage(chatId, "Usage: /steam <Game Name> <Target Price>");
            return;
        }

        String[] gameAndPrice = parts[1].trim().split(" ");
        if (gameAndPrice.length < 2) {
            sendMessage(chatId, "Invalid format. Example: /steam Sea of Thieves 2000");
            return;
        }

        String priceStr = gameAndPrice[gameAndPrice.length - 1];
        String gameName = String.join(" ", Arrays.copyOf(gameAndPrice, gameAndPrice.length - 1));
        BigDecimal desiredPrice;
        try {
            desiredPrice = new BigDecimal(priceStr.replaceAll("[^\\d.]", ""));
        } catch (NumberFormatException e) {
            sendMessage(chatId, "Invalid price format.");
            return;
        }
        Game game = gameRepository.findByGameNameIgnoreCase(gameName)
                .orElseGet(() -> {
                    String steamAppId = steamPriceFetchService.fetchSteamAppId(gameName);
                    if (steamAppId == null) {
                        sendMessage(chatId, "Game not found on Steam: " + gameName);
                        return null;
                    }
                    Game newGame = new Game();
                    newGame.setGameName(gameName);
                    newGame.setSteamAppId(steamAppId);
                    return gameRepository.save(newGame);
                });

        if (game == null) return;
        boolean alertExists = priceAlertRepository.existsByUser_ChatIdAndGameAndDesiredPrice(chatId, game, desiredPrice);
        if (alertExists) {
            sendMessage(chatId, "You already have an alert for " + game.getGameName() + " at ₹" + desiredPrice);
            return;
        }

        saveUserAlert(chatId, game, desiredPrice);
        sendMessage(chatId, "Steam alert set for " + game.getGameName() + " at ₹" + desiredPrice);
    }

    private void saveUserAlert(long chatId, Game game, BigDecimal desiredPrice) {
        User user = userRepository.findByChatId(chatId)
                .orElseGet(() -> {
                    User newUser = new User();
                    newUser.setChatId(chatId);
                    return userRepository.save(newUser);
                });

        UserGame userGame = new UserGame();
        userGame.setUser(user);
        userGame.setGame(game);
        userGame.setDesiredPrice(desiredPrice);
        userGameRepository.save(userGame);
    }



    public void sendMessage(long chatId, String text){
        SendMessage message = new SendMessage(String.valueOf(chatId), text);
        try {
            execute(message);
            log.info("Sent message to chat_id {}: '{}'", chatId, text);
        } catch (TelegramApiException e) {
            log.error("Failed to send message to chat_id {}: {}", chatId, e.getMessage());
        }
    }

    private void showCommands(long chatId){
        StringBuilder builder = new StringBuilder("Welcome!\n\nAvailable commands:\n");
        botCommands.getCommandList().forEach(botCommand ->
                builder.append(botCommand.getCommand())
                        .append(" - ")
                        .append(botCommand.getDescription())
                        .append("\n"));
        sendMessage(chatId,builder.toString());
    }
    private void handleRegisterCommand(long chatId, String messageText){
        String[] parts = messageText.split(" " , 2);
        if (parts.length < 2 || parts[1].isBlank()){
            sendMessage(chatId,"Please use the format: /register <Your Name>");
            return;
        }
        String firstName = parts[1].trim();
        String responseText = userService.registerUser(chatId,firstName);
        sendMessage(chatId,responseText);
    }
}

