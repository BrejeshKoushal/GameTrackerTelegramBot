package org.example.bot;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.commands.SetMyCommands;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.commands.scope.BotCommandScopeDefault;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Component
@Slf4j
public class MyTelegramBot extends TelegramLongPollingBot {
    private final UserService userService;
    private final BotCommands botCommands;
    private final String botUsername;
    public MyTelegramBot(UserService userService,
                         BotCommands botCommands,
                         @Value("${telegram.bot.username}") String botUsername,
                         @Value("${telegram.bot.token}") String botToken) {
        super(botToken);
        this.userService = userService;
        this.botCommands = botCommands;
        this.botUsername = botUsername;

        log.info("Bot '{}' is being created.", this.botUsername);
        if (botToken == null || botToken.isBlank()) {
            log.error("CRITICAL ERROR: Bot token is EMPTY. Check your application.properties file.");
        }
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

                switch (command){
                    case "/start":
                        showCommands(chatId);
                        break;
                    case "/register":
                        handleRegisterCommand(chatId,messageText);
                        break;
                    case "/freegamestoday":
                        sendMessage(chatId,"Fetching the free games..... (coming soon)");
                        break;
                    case "/setalert":
                        sendMessage(chatId,"Setting alert..... (coming soon)");
                        break;
                    case "/myalerts":
                        sendMessage(chatId,"Fetching your alerts..... (coming soon)");
                        break;
                    default:
                        sendMessage(chatId,"Sorry, I don't recognize that command.");
                        break;
                }
            } else {
                sendMessage(chatId,"Please use a valid command.");
            }
        }
    }

    private void sendMessage(long chatId, String text){
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

