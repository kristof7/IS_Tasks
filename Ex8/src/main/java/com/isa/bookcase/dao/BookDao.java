package com.isa.bookcase.dao;

import com.isa.bookcase.entity.Book;

import java.util.List;

public interface BookDao {

    List<Book> findAllBooks();
}
