package com.learningspring.BankingApplication.repository;

import com.learningspring.BankingApplication.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

//2 params entity and primary key
public interface AccountRepository extends JpaRepository<Account, Long> {

}
