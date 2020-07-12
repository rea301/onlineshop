package com.ahmedova.onlineshop.controller;

import com.ahmedova.onlineshop.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")

public class UserController {

    @PostMapping
    public String createUser(@RequestBody User user){
        return "Logged in as".concat(user.getFirstName());
    }

    @GetMapping ("/shop")
    private String shop() {
        return "Welcome";
    }
}