package com.test.adptest.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public enum BillsValue {

    ONE(BigDecimal.ONE), TWO(BigDecimal.valueOf(2)), FIVE(BigDecimal.valueOf(5)), TEN(BigDecimal.valueOf(10)),
    TWENTY(BigDecimal.valueOf(20)), FIFTY(BigDecimal.valueOf(50)), ONE_HUNDRED(BigDecimal.valueOf(100));
    private BigDecimal value;

}
