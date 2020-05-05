package com.isa.bookcase.repository;

import com.isa.bookcase.domain.Book;

import javax.ejb.Local;
import java.util.List;

@Local
public interface BooksRepository {

    List<Book> findAll();

    List<Book>showArandomBook();

    List<Book> findBookForAuthor(String author);

    List<Book> findBookForTitle(String title);
}
