package com.isa.bookcase.repository;

import com.isa.bookcase.domain.Book;

import javax.ejb.Local;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Local
public interface BooksRepository {

    abstract List<Book> findAll();
    public List<Book> writeRandomBook();
    public Optional<Book> findBookForAuthor(String author);
}
