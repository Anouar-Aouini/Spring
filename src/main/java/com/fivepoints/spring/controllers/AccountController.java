package com.fivepoints.spring.controllers;

import com.fivepoints.spring.entities.Account;
import com.fivepoints.spring.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Table;
import java.util.List;

@RestController
@Table(name = "account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @GetMapping(path = "/accounts")
    public List<Account> getAllAccounts(){
        return this.accountService.getPositions();
    }

    @PostMapping(path = "/accounts")
    public Account postAccount(@RequestBody Account account){
        account.setId();
        return this.accountService.addNewAccount(account);
}}
