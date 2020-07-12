package com.ahmedova.onlineshop.repository;

import com.ahmedova.onlineshop.model.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account,Long> {
}