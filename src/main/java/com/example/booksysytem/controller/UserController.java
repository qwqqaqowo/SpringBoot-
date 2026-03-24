package com.example.booksysytem.controller;

import com.example.booksysytem.entity.User;
import com.example.booksysytem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    // 登录提交
    @GetMapping("/login")
    public String login(User user, HttpSession session) {
        User loginUser = userService.login(user);

        if (loginUser != null) {
            // 登录成功 → 跳转到图书列表
            session.setAttribute("user", loginUser);
            return "redirect:/book/list";
        } else {
            // 登录失败 → 回到登录页
            return "login";
        }
    }
}