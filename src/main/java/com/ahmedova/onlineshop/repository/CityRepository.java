package com.ahmedova.onlineshop.repository;

import com.ahmedova.onlineshop.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City,Long> {
}