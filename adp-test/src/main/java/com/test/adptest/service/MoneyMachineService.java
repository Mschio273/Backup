package com.test.adptest.service;

import com.test.adptest.exception.handler.InvalidValueException;
import com.test.adptest.model.Bill;
import com.test.adptest.model.Coin;
import com.test.adptest.model.enums.CoinsValue;
import com.test.adptest.model.mapper.CoinMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
@AllArgsConstructor
public class MoneyMachineService {
    public List<Coin> exchanceMoney(List<Bill> bills) {
        List<Coin> coins = setAmountOfCoins();
        verifyValidBills(bills);
        BigDecimal billValue = totalBillsValue(bills);
        List<BigDecimal> coinsBalance = eachCoinTotalValue(coins);
        BigDecimal totalBalance = sumTotalValue(coinsBalance);
        verifyTransaction(totalBalance, billValue);
        return executeTransaction(coinsBalance, billValue, coins);
    }

    private List<Coin> setAmountOfCoins() {
        List<BigDecimal> value = new ArrayList<>();
        BigDecimal quantity = BigDecimal.valueOf(100);
        value.add(CoinsValue.FIVE_CENTS.getValue());
        value.add(CoinsValue.TEN_CENTS.getValue());
        value.add(CoinsValue.ONE_CENT.getValue());
        value.add(CoinsValue.TWENTY_FIVE_CENTS.getValue());

        Collections.sort(value);
        List<Coin> coins = new ArrayList<>();

        for (BigDecimal coin : value) {
            coins.add(CoinMapper.mapToCoin(quantity, coin));
        }
        Collections.reverse(coins);
        return coins;
    }

    private void verifyValidBills(List<Bill> bills) {
        List<BigDecimal> validBills = Arrays.asList(BigDecimal.ONE, BigDecimal.valueOf(2), BigDecimal.valueOf(5),
                BigDecimal.valueOf(10), BigDecimal.valueOf(20), BigDecimal.valueOf(50), BigDecimal.valueOf(100));

        for (int i = 0; i < bills.toArray().length; i++) {
            if (!validBills.contains(bills.get(i).getValue())) {
                throw new InvalidValueException("Invalid bill value");
            }
        }
    }

    private BigDecimal totalBillsValue(List<Bill> bills) {
        BigDecimal totalBills = BigDecimal.ZERO;
        List<BigDecimal> result = new ArrayList<>();
        for (int i = 0; i < bills.toArray().length; i++) {
            BigDecimal balance = bills.get(i).getValue().multiply(bills.get(i).getQuantity());
            result.add(balance);
            totalBills = totalBills.add(result.get(i));
        }
        return totalBills;
    }

    private List<BigDecimal> eachCoinTotalValue(List<Coin> coins) {
        List<BigDecimal> balances = new ArrayList<>();
        for (int i = 0; i < coins.toArray().length; i++) {
            BigDecimal balance = coins.get(i).getValue().multiply(coins.get(i).getQuantity());
            balances.add(balance);
        }
        return balances;
    }

    private BigDecimal sumTotalValue(List<BigDecimal> balances) {
        BigDecimal totalBalance = BigDecimal.ZERO;
        for (int i = 0; i < balances.toArray().length; i++) {
            totalBalance = totalBalance.add(balances.get(i));
        }
        return totalBalance;
    }

    private void verifyTransaction(BigDecimal totalBalance, BigDecimal valor) {
        if (valor.compareTo(totalBalance) > 0) {
            throw new InvalidValueException("Machine balance is not enought");
        }
    }

    private List<Coin> executeTransaction(List<BigDecimal> eachCoinBalance, BigDecimal billsValue, List<Coin> coins) {
        List<Coin> transaction = new ArrayList<>();
        for (int i = 0; i < eachCoinBalance.toArray().length; i++) {
            if (billsValue.compareTo(eachCoinBalance.get(i)) <= 0) {
                BigDecimal coinsLeft = coins.get(i).getQuantity();
                BigDecimal coinsUsed = BigDecimal.ZERO;
                while (billsValue.compareTo(BigDecimal.ZERO) != 0) {
                    billsValue = billsValue.subtract(coins.get(i).getValue());
                    coinsLeft = coinsLeft.subtract(BigDecimal.ONE);
                    coinsUsed = coinsUsed.add(BigDecimal.ONE);
                }
                transaction.add(CoinMapper.mapToCoin(coinsUsed, coins.get(i).getValue()));
            } else if (billsValue.compareTo(eachCoinBalance.get(i)) > 0) {
                BigDecimal coinsLeft = coins.get(i).getQuantity();
                BigDecimal coinsUsed = BigDecimal.ZERO;
                while (coinsLeft.compareTo(BigDecimal.ZERO) != 0) {
                    billsValue = billsValue.subtract(coins.get(i).getValue());
                    coinsLeft = coinsLeft.subtract(BigDecimal.ONE);
                    coinsUsed = coinsUsed.add(BigDecimal.ONE);
                }
                transaction.add(CoinMapper.mapToCoin(coinsUsed, coins.get(i).getValue()));
            } else
                return transaction;
        }
        return transaction;
    }
}