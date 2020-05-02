package com.isa.bookcase.repository;

import com.isa.bookcase.domain.Book;

import javax.ejb.Local;
import java.util.List;

@Local
public interface BookRepository {

    List<Book> findAll();
    Book getRandomBook();
    List<Book> findByAuthor(String author);
    List<Book> findByAuthorAndTitle(String author, String title);
}
