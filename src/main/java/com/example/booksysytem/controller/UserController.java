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

    // 这里改成 /book/login ！！！
    @GetMapping("/book/login")
    public String login(User user, HttpSession session) {
        User loginUser = userService.login(user);

        if (loginUser != null) {
            session.setAttribute("user", loginUser);
            // 跳图书列表 ✅
            return "redirect:/book/list";
        } else {
            return "login";
        }
    }
}