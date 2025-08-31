package org.example.bot;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.commands.BotCommand;

import java.util.List;

@Component
public class BotCommands {
    public List<BotCommand> getCommandList(){
        return List.of(
                new BotCommand("/start","Start the bot"),
                new BotCommand("/register", "Register yourself (e.g.,  /register Rohan)"),
                new BotCommand("/freegamestoday", "Get a list of today's free games"),
                new BotCommand("/setalert", "Track a game (e.g., /setalert Cyberpunk 20.50)"),
                new BotCommand("/myalerts", "See all your active game alerts")
        );
    }
}
