package com.isa.bookcase.repository;

import com.isa.bookcase.domain.Book;
import javax.ejb.Local;
import java.util.List;
import java.util.Optional;

@Local
public interface BookRepository {

    List<Book> findAll();
    Book getRandomBook();
    List<Book> getBooksListByAuthor(String author);
    Optional<Book> getBookByAuthor(String author);
    List<Book> getBooksListByTitle(String title);
    Optional<Book> getBookByTitle(String title);
}
