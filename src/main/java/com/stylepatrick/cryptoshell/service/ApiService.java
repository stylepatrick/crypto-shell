package com.stylepatrick.cryptoshell.service;

import com.stylepatrick.cryptoshell.config.AppConfig;
import com.stylepatrick.cryptoshell.entity.TickerPrice;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class ApiService {

    private final AppConfig appConfig;

    public TickerPrice getLastPrice(String symbol) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<TickerPrice> response = restTemplate.getForEntity(appConfig.getApiUrl() + "/v3/ticker/24hr?symbol=" + symbol, TickerPrice.class);
        return response.getBody();
    }
}
