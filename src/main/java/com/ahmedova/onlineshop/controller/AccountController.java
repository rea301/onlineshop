package com.ahmedova.onlineshop.controller;

import com.ahmedova.onlineshop.model.Account;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/accounts")
public class AccountController {

    @PostMapping
    public void createAccount(@RequestBody Account account) {

    }

    @PutMapping
    public void updateAccount(@RequestBody Account account) {

    }

    @GetMapping
    public List<Account> getAccounts() {
        return null;
    }

    @GetMapping("/{accountId}")
    public Account getAccount(@PathVariable("accountId") Long accountId) {
        return null;
    }

    @DeleteMapping
    public void deleteAccount() {

    }
}