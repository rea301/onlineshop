package com.ahmedova.onlineshop.repository;
import com.ahmedova.onlineshop.model.Shop;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class ShopRepositoryCustomImpl implements ShopRepositoryCustom {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public <T> T getReference(Long id, Class<T> tClass) {
        return entityManager.getReference(tClass, id);

    }
}