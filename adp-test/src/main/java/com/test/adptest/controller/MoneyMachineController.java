package com.test.adptest.controller;

import com.test.adptest.model.Bill;
import com.test.adptest.model.Coin;
import com.test.adptest.service.MoneyMachineService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/cashier")
public class MoneyMachineController {

    private final MoneyMachineService moneyMachineService;

    @GetMapping
    public List<Coin> exchangeMoney(@RequestBody List<Bill> bills) {
        return moneyMachineService.exchanceMoney(bills);
    }
}
