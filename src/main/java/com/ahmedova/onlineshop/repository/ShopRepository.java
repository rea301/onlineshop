package com.ahmedova.onlineshop.repository;

import com.ahmedova.onlineshop.model.Shop;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepository extends CrudRepository<Shop, Long>, ShopRepositoryCustom, PagingAndSortingRepository<Shop, Long> {

}