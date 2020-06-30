package com.isa.bookcase.dao;

import com.isa.bookcase.entity.Book;
import com.isa.bookcase.entity.Category;

import java.util.List;


public interface BookDao {

    List<Book> findAllBooks();

}
