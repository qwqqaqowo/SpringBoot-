package com.example.booksysytem.controller;

import com.example.booksysytem.entity.User;
import com.example.booksysytem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    // 显示登录页
    @GetMapping("/login")
    public String showLogin() {
        return "login";
    }

    // 处理登录！这里必须用 PostMapping！
    @PostMapping("/login")
    public String login(User user, HttpSession session) {
        User loginUser = userService.login(user);

        if (loginUser != null) {
            session.setAttribute("user", loginUser);
            // 登录成功 跳图书列表
            return "redirect:/book/list";
        } else {
            // 登录失败回到登录页
            return "redirect:/user/login";
        }
    }
}