package com.ahmedova.onlineshop.service;

import com.ahmedova.onlineshop.model.Shop;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ShopService {
    void createShop(Shop shop);
    void updateShop(Shop shop);
    Iterable<Shop> getAllBShops();
    Shop getShopById(Long shopId);
    void deleteShopById(Long shopId);
}