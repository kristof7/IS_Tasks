package com.isa.bookcase.repository;

import com.isa.bookcase.domain.Book;

import javax.ejb.Local;
import java.util.List;
import java.util.Optional;


@Local
public interface BooksRepository {

    Optional<Book> findByAuthor(String author);

    List<Book> findAll();

    Book randomBook();



}