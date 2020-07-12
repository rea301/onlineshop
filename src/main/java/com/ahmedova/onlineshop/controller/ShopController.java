package com.ahmedova.onlineshop.controller;

import com.ahmedova.onlineshop.exception.ExceptionClass;
import com.ahmedova.onlineshop.model.Shop;
import com.ahmedova.onlineshop.service.ShopService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/shops")
public class ShopController {

    private final ShopService shopService;

    @Autowired
    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @PostMapping
    public void createShop(@RequestBody Shop shop){
        shopService.createShop(shop);
    }

    @PutMapping
    public void updateShop(@RequestBody Shop shop){

    }

    @GetMapping
    public Iterable<Shop> getAllShops(){
        return shopService.getAllBShops();
    }

    @GetMapping("/{shopId}")
    public Shop getShop(@PathVariable Long shopId){
        return shopService.getShopById(shopId);
    }

    @DeleteMapping("/{shopId}")
    public void deleteShop(@PathVariable Long shopId){

    }

    @ExceptionHandler({ExceptionClass.class})
    public ResponseEntity<Object> handleExceptions(ExceptionClass e){
        return ResponseEntity.ok("{\"message:\"no results\"}");
    }
}