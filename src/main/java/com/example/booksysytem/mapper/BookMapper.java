package com.example.booksysytem.mapper;

import com.example.booksysytem.entity.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookMapper {
    @Select("select * from book")
    List<Book> findAll();

    @Insert("INSERT INTO book(name, author, price, type) VALUES (#{name}, #{author}, #{price}, #{type})")
    int addBook(Book book);
}