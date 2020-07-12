package com.ahmedova.onlineshop.service;

import com.ahmedova.onlineshop.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {

    void createOrder(Order order);

    void updateOrder(Order order);

    List<Order> getAllOrder();

    Order getOrderById(Long orderId);

    void deleteOrderById(Long orderId);
}