package com.learningspring.BankingApplication.service;

import com.learningspring.BankingApplication.dto.AccountDto;

import java.util.List;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double amount);

    AccountDto withdraw(long id , double amount);

    List<AccountDto> getAllAccounts();

    void deleteAccount(Long id);

}
