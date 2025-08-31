package org.example.scheduler;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.bot.MyTelegramBot;
import org.example.entity.PriceAlert;
import org.example.repository.PriceAlertRepository;
import org.example.service.SteamPriceFetchService;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Slf4j
@Component
@EnableScheduling
@RequiredArgsConstructor
public class PriceAlertScheduler {

    private final PriceAlertRepository priceAlertRepository;
    private final SteamPriceFetchService steamPriceFetchService;
    private final MyTelegramBot telegramBot;

    @Scheduled(fixedRate = 3600000) // every 1 hour
    public void checkPriceAlerts() {
        List<PriceAlert> alerts = priceAlertRepository.findByNotifiedFalse();

        for (PriceAlert alert : alerts) {
            String steamAppId = alert.getGame().getSteamAppId();
            if (steamAppId == null) continue;

            BigDecimal currentPrice = steamPriceFetchService.fetchPrice(steamAppId);
            if (currentPrice != null && currentPrice.compareTo(alert.getDesiredPrice()) <= 0) {
                telegramBot.sendMessage(
                        alert.getUser().getChatId(),
                        "Good news! " + alert.getGame().getGameName() +
                                " is now ₹" + currentPrice +
                                " (your target: ₹" + alert.getDesiredPrice() + ")"
                );

                alert.setNotified(true);
                priceAlertRepository.save(alert);
            }
        }
    }
}
