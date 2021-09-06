package com.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.gateway.model.Account;

@RestController
public class GatewayFallback {

    @GetMapping("account/{id}")
    public Account getAccount(@PathVariable Integer id) {
        Account account = new Account();

        account.setId(1);
        account.setNumber("123456");

        return account;
    }

}
