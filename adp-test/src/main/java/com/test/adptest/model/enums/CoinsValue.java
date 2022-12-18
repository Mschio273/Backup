package com.test.adptest.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public enum CoinsValue {

    ONE_CENT(BigDecimal.valueOf(0.01)), FIVE_CENTS(BigDecimal.valueOf(0.05)),
    TEN_CENTS(BigDecimal.valueOf(0.1)), TWENTY_FIVE_CENTS(BigDecimal.valueOf(0.25));
    private BigDecimal value;
}
