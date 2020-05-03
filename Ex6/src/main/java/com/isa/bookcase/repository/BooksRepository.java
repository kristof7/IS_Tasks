package com.isa.bookcase.repository;

import com.isa.bookcase.domain.Book;

import javax.ejb.Local;
import java.util.List;
import java.util.Set;

@Local
public interface BooksRepository {

    List<Book> findAllBooks();

    Book findRandomBook();

    Set<Book> findByAuthor(String author);

    Set<Book> findByTitleAndAuthor(String title, String author) ;
}