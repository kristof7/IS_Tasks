package com.isa.bookcase.repository;

import com.isa.bookcase.domain.Book;

import javax.ejb.Local;
import java.util.List;
import java.util.Optional;


@Local
public interface BooksRepository {

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    List<Book> findAll();

    Book randomBook();



}