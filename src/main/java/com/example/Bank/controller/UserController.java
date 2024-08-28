package com.example.Bank.controller;

import com.example.Bank.entity.User;
import com.example.Bank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService service;

    //create User
    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User createUser = service.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(createUser);
    }

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable Long userId) {
        User user = service.getUserById(userId);
        return user;
    }

    @GetMapping("/getallusers")
    public List<User> getAllUser() {
        List<User> user = service.getAllUser();
        return user;
    }

}
