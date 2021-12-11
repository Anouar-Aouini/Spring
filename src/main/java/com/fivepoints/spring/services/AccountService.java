package com.fivepoints.spring.services;

import com.fivepoints.spring.entities.Account;
import com.fivepoints.spring.entities.Position;
import com.fivepoints.spring.repositories.AccountRepository;
import com.fivepoints.spring.repositories.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AccountService {
    @Autowired
    AccountRepository accountRepository;

    public Account addNewAccount(Account account) {
        return this.accountRepository.save(account);
    }
    public List<Account> getPositions(){
        List<Account> accounts=(List<Account>) accountRepository.findAll();
        return accounts;
    }
}
