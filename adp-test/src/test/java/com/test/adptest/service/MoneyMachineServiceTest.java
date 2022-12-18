package com.test.adptest.service;

import com.test.adptest.model.Bill;
import com.test.adptest.model.Coin;
import com.test.adptest.service.stub.MoneyStub;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class MoneyMachineServiceTest {
    @InjectMocks
    MoneyMachineService moneyMachineService;

    @Test
    void givenAnAmountOfBillsShouldReturnTheSameAmountInCoins() {
        List<Bill> bills = MoneyStub.billListStub();
        List<Coin> stubExpected = MoneyStub.coinListStub();

        List<Coin> response = moneyMachineService.exchanceMoney(bills);
        Assertions.assertEquals(stubExpected, response);
    }
}