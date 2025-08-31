package org.example.bot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@Component
@Slf4j
@EnableScheduling
public class BotInitializer {

    private final MyTelegramBot myTelegramBot;

    @Autowired
    public BotInitializer(MyTelegramBot myTelegramBot) {
        this.myTelegramBot = myTelegramBot;
    }

    // This method will be called once the Spring application is fully started.
    @EventListener({ContextRefreshedEvent.class})
    public void init() {
        try {
            // Create the TelegramBotsApi object. This is the main entry point for the library.
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            // Register your bot. This is the crucial step.
            telegramBotsApi.registerBot(myTelegramBot);
            log.info("SUCCESS: Telegram bot has been registered and is now running.");
        } catch (TelegramApiException e) {
            // If this error is logged, it means there was a problem connecting to Telegram.
            // This is almost always due to an incorrect bot token or network issues.
            log.error("CRITICAL ERROR: Failed to register bot. Please check your bot token and internet connection.", e);
        }
    }
}
