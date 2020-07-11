package com.ahmedova.onlineshop.model;


import javax.persistence.*;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "orderDetail")
public class OrderDetail {
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String status;
    @Column
    private Instant deliveryDate;
    @OneToMany
    private Set<Product> product = new HashSet<>();

    public String getStatus() {
        return status;
    }

    public Instant getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Instant deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<Product> getProduct() {
        return product;
    }

    public void setProduct(Set<Product> product) {
        this.product = product;
    }
}
