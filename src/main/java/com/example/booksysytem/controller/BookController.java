package com.example.booksysytem.controller;

import com.example.booksysytem.entity.Book;
import com.example.booksysytem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    // 图书列表页面
    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("bookList", bookService.findAll());
        return "bookList";  // 去找 templates/bookList.html
    }

    // 去新增页面
    @GetMapping("/toAdd")
    public String toAdd() {
        return "bookAdd";   // 去找 templates/bookAdd.html
    }

    // 执行新增 → 新增完跳回列表
    @GetMapping("/add")
    public String add(Book book) {
        bookService.addBook(book);
        return "redirect:/book/list"; // 新增成功 → 回到列表页
    }
}