package com.ahmedova.onlineshop.repository;

import com.ahmedova.onlineshop.model.Shop;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepositoryCustom {
    <T> T getReference(Long id, Class<T> tClass);
}