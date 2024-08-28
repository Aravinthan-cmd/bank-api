package com.example.Bank.service;

import com.example.Bank.entity.User;

import java.util.List;

public interface UserService {

    public User createUser(User user);
    public User getUserById(Long userId);
    public List<User> getAllUser();

}
