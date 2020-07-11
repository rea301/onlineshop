package com.ahmedova.onlineshop.model;

import com.ahmedova.onlineshop.model.enums.UserType;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "order")
public class Order {
    @Id
    private Long id;

    @Column
    @Enumerated(EnumType.STRING)

    @OneToMany
    @JoinTable(
            name = "order_status",
            joinColumns = @JoinColumn(name = "order_status"),
            inverseJoinColumns = @JoinColumn(name = "orderdetail_status")

    )
    private Set<OrderDetail> orderDetails = new HashSet<>();
}
