package com.ahmedova.onlineshop.model;

import com.ahmedova.onlineshop.model.enums.AccountType;

import javax.persistence.*;

@Entity
@Table(name = "accounts")
public class Account {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User owner;
    @Column(name = "account_type")
    @Enumerated(EnumType.STRING)
    private AccountType accountType = AccountType.NONE;

    public Long getId() {
        return id;
    }


    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }


    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }


}