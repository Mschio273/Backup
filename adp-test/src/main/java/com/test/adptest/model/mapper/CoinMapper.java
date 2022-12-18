package com.test.adptest.model.mapper;

import com.test.adptest.model.Coin;

import java.math.BigDecimal;

public class CoinMapper {

    public static Coin mapToCoin(BigDecimal quantity, BigDecimal coin) {
        return Coin.builder()
                .value(coin)
                .quantity(quantity)
                .build();
    }
}
