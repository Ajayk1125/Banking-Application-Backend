package com.learningspring.BankingApplication.mapper;

import com.learningspring.BankingApplication.dto.AccountDto;
import com.learningspring.BankingApplication.entity.Account;



public class AccountMapper {
    //converting the account dto into account jpa entity
    public static Account mapToAccount(AccountDto accountDto){
        Account account = new Account(
            accountDto.getId(),
            accountDto.getAccountHolderName(),
            accountDto.getBalance()
        );
        return account;
    }

    //converting account jpa entity into account dto
    public static AccountDto mapToAccountDto(Account account){
        AccountDto accountDto = new AccountDto(
          account.getId(),
          account.getAccountHolderName(),
          account.getBalance()
        );
        return accountDto;
    }
}

//purpose of this file is to convert the jpa entity into dto and vice versa