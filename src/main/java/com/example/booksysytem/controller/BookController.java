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

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("bookList", bookService.findAll());
        return "bookList";
    }

    @GetMapping("/toAdd")
    public String toAdd() {
        return "bookAdd";
    }

    @GetMapping("/add")
    public String add(Book book) {
        bookService.addBook(book);
        return "redirect:/book/list";
    }

    @GetMapping("/delete")
    public String delete(Integer id) {
        bookService.deleteById(id);
        return "redirect:/book/list";
    }

    @GetMapping("/toUpdate")
    public String toUpdate(Integer id, Model model) {
        model.addAttribute("book", bookService.findById(id));
        return "bookUpdate";
    }

    @GetMapping("/update")
    public String update(Book book) {
        bookService.update(book);
        return "redirect:/book/list";
    }

    // ====================== 登录页面接口（关键！！）======================
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
}