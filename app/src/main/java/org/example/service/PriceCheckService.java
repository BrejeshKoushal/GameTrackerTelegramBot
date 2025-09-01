package org.example.service;

import org.example.repository.GameRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class PriceCheckService {
    private final GameRepository gameRepository;
    private final SteamPriceFetchService steamService;

    public PriceCheckService(GameRepository gameRepository, SteamPriceFetchService steamService) {
        this.gameRepository = gameRepository;
        this.steamService = steamService;
    }

    @Scheduled(cron = "0 0 */6 * * *")
    private void updatePrices(){
        var games = gameRepository.findAll();
        for (var game : games){
            if (game.getSteamAppId()!=null){
                var steamPrice = steamService.fetchPrice(game.getSteamAppId());
                game.setCurrentPrice(steamPrice);
            }
            gameRepository.save(game);
        }
    }
}
