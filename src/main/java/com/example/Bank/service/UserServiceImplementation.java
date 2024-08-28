package com.example.Bank.service;

import com.example.Bank.entity.User;
import com.example.Bank.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplementation implements UserService{

    @Autowired
    UserRepository repository;

    @Override
    public User createUser(User user) {
        User user_saved = repository.save(user);
        return user_saved;
    }

    @Override
    public User getUserById(Long userId) {
        Optional<User> user = repository.findById(userId);
        if (user.isEmpty()) {
            throw new RuntimeException("User is not Found");
        }
        User user_found = user.get();
        return user_found;
    }

    @Override
    public List<User> getAllUser() {
        List<User> listOfUser = repository.findAll();
        return listOfUser;
    }

}
