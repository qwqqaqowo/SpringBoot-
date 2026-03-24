package com.example.booksysytem.service;

import com.example.booksysytem.entity.Book;
import com.example.booksysytem.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookMapper bookMapper;

    public List<Book> findAll() {
        return bookMapper.findAll();
    }

    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }

    public void deleteById(Integer id){
        bookMapper.deleteById(id);
    }

    public void update(Book book){
        bookMapper.update(book);
    }

    public Book findById(Integer id) {
        return bookMapper.findById(id);
    }
}