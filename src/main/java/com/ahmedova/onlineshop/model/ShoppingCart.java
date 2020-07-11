package com.ahmedova.onlineshop.model;

import com.ahmedova.onlineshop.model.enums.PaymentType;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "shoppingCart")
public class ShoppingCart {

    @Id
    private Long id;

    @Column
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType = PaymentType.NONE;
    @Column
    private BigDecimal sumTotal;
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public BigDecimal getSumTotal() {
        return sumTotal;
    }

    public void setSumTotal(BigDecimal sumTotal) {
        this.sumTotal = sumTotal;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}