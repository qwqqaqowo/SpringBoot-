package com.example.booksysytem.service;

import com.example.booksysytem.entity.User;
import com.example.booksysytem.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User login(User user) {
        return userMapper.login(user);
    }
}