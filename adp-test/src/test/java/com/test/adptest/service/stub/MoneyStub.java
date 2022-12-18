package com.test.adptest.service.stub;

import com.test.adptest.model.Bill;
import com.test.adptest.model.Coin;
import com.test.adptest.model.enums.CoinsValue;

import java.math.BigDecimal;
import java.util.List;

public class MoneyStub {

    public static List<Bill> billListStub() {
        return List.of(Bill.builder()
                .value(BigDecimal.ONE)
                .quantity(BigDecimal.ONE)
                .build());
    }

    public static List<Coin> coinListStub() {
        return List.of(Coin.builder()
                        .value(CoinsValue.TWENTY_FIVE_CENTS.getValue())
                        .quantity(BigDecimal.valueOf(4))
                        .build(),
                Coin.builder()
                        .value(CoinsValue.TEN_CENTS.getValue())
                        .quantity(BigDecimal.valueOf(0))
                        .build(),
                Coin.builder()
                        .value(CoinsValue.FIVE_CENTS.getValue())
                        .quantity(BigDecimal.valueOf(0))
                        .build(),
                Coin.builder()
                        .value(CoinsValue.ONE_CENT.getValue())
                        .quantity(BigDecimal.valueOf(0))
                        .build());
    }
}
