package com.stylepatrick.cryptoshell.shell;

import com.stylepatrick.cryptoshell.entity.TickerPrice;
import com.stylepatrick.cryptoshell.service.ApiService;
import lombok.AllArgsConstructor;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
@AllArgsConstructor
public class ShellCommands {

    private final ApiService apiService;

    @ShellMethod("Get last price by symbol (ex. ETHUSDT; BTCUSDT; etc.)")
    public String lastPrice(String symbol) {
        TickerPrice tickerPrice = apiService.getLastPrice(symbol);
        return "Last price: " + tickerPrice.lastPrice();
    }
}
