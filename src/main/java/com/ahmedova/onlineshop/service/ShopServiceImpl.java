package com.ahmedova.onlineshop.service;

import com.ahmedova.onlineshop.exception.ExceptionClass;
import com.ahmedova.onlineshop.model.Address;
import com.ahmedova.onlineshop.model.Shop;
import com.ahmedova.onlineshop.repository.AddressRepository;
import com.ahmedova.onlineshop.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class ShopServiceImpl implements ShopService {

    private final ShopRepository shopRepository;
    private final AddressRepository addressRepository;

    @Autowired
    public ShopServiceImpl(ShopRepository shopRepository, AddressRepository addressRepository) {
        this.shopRepository = shopRepository;
        this.addressRepository = addressRepository;
    }


    @Override
    public void createShop(Shop shop) {

        validateShop(shop);

        if (null != shop.getAddress().getId()) {
            Address addressReference = shopRepository.getReference(shop.getAddress().getId(), Address.class);
            shop.setAddress(addressReference);
            addressRepository.save(shop.getAddress());
        }else{
            addressRepository.save(shop.getAddress());
        }


        shopRepository.save(shop);
    }

    @Override
    public void updateShop(Shop shop) {

    }

    @Override
    public Iterable<Shop> getAllBShops() {
        Pageable pageable = PageRequest.of(0,2);
        return shopRepository.findAll(pageable);
    }


    @Override
    public Shop getShopById(Long shopId) {
        Optional<Shop> bankEntity = shopRepository.findById(shopId);

        if (bankEntity.isPresent()){
            return bankEntity.get();
        }

        throw new ExceptionClass();
    }

    @Override
    public void deleteShopById(Long shopId) {

    }

    private void validateShop(Shop shop) {
        if (null == shop.getAddress()) {
            throw new IllegalArgumentException("Invalid address");

        }
    }
}