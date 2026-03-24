package com.example.booksysytem.controller;

import com.example.booksysytem.entity.User;
import com.example.booksysytem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/login")
    public String login(User user) {
        User u = userService.login(user);
        if(u != null){
            return "登录成功";
        }else{
            return "账号或密码错误";
        }
    }
}