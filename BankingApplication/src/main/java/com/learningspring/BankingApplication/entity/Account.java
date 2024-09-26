package com.learningspring.BankingApplication.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "accounts")

public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //This line indicates that it will auto increment the primary key
    private long id;
    @Column(name = "account_holder_Name")
    private String accountHolderName;
    private double balance;

}
