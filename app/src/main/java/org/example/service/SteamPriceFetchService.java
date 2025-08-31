package org.example.service;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import lombok.extern.slf4j.Slf4j;
import org.example.repository.GameRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Slf4j
@Service
public class SteamPriceFetchService {
    private final GameRepository gameRepository;

    public SteamPriceFetchService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    private final HttpClient client = HttpClient.newHttpClient();
    public BigDecimal fetchPrice(String appId){
        try{
            String url = "https://store.steampowered.com/api/appdetails?appids=" + appId + "&cc=in";
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
            HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
            JsonObject json = JsonParser.parseString(response.body())
                    .getAsJsonObject()
                    .getAsJsonObject(appId)
                    .getAsJsonObject("data")
                    .getAsJsonObject("price_overview");
            if (json!=null){
                int priceIncents = json.get("final").getAsInt();
                return BigDecimal.valueOf(priceIncents/100.0);
            }
        }
        catch (Exception e){
            log.info("Failed to fetch price in fetchPrice function service");
        }
        return null;
    }
    public String fetchSteamAppId(String gameName) {
        var gameId = gameRepository.findByGameNameIgnoreCase(gameName);
        if (gameId.isPresent()){
            return gameId.get().toString();
        }
        try {
            String url = "https://api.steampowered.com/ISteamApps/GetAppList/v2/";
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            JsonObject json = JsonParser.parseString(response.body())
                    .getAsJsonObject()
                    .getAsJsonObject("applist");

            for (var app : json.getAsJsonArray("apps")) {
                JsonObject obj = app.getAsJsonObject();
                String name = obj.get("name").getAsString();
                if (name.equalsIgnoreCase(gameName)) {
                    return obj.get("appid").getAsString();
                }
            }
        } catch (Exception e) {
            log.error("Failed to fetch Steam App ID for '{}'", gameName, e);
        }
        return null;
    }

}
