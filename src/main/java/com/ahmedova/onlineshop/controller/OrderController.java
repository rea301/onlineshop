package com.ahmedova.onlineshop.controller;

import com.ahmedova.onlineshop.model.Order;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/contracts")
public class OrderController {
    @PostMapping
    public void createOrder(@RequestBody Order order){

    }
    @PutMapping
    public void updateOrder(@RequestBody Order order){

    }
    @GetMapping
    public List<Order> getAllOrders(){
        return null;
    }
    @GetMapping("/{orderId}")
    public Order getOrder(@PathVariable Long orderId){
        return new Order();
    }
    @DeleteMapping("/{orderId}")
    public void deleteOrder(@PathVariable Long orderId){

    }
}