package com.isa.bookcase.repository;

import com.isa.bookcase.domain.Book;

import javax.ejb.Local;
import java.util.Comparator;
import java.util.List;

@Local
public interface BooksRepository {

    abstract List<Book> findAll();
    public List<Book> writeRandomBook();
}
