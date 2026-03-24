package com.example.booksysytem.mapper;

import com.example.booksysytem.entity.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookMapper {
    @Select("select * from book")
    List<Book> findAll();

    @Insert("INSERT INTO book(name, author, price, type) VALUES (#{name}, #{author}, #{price}, #{type})")
    int addBook(Book book);

    @Delete("delete from book where id=#{id}")
    void deleteById(Integer id);

    @Update("update book set name=#{name},author=#{author},price=#{price},type=#{type} where id=#{id}")
    void update(Book book);

    @Select("select * from book where id=#{id}")
    Book findById(Integer id);
}