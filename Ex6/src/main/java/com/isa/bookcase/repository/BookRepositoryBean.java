package com.isa.bookcase.repository;

import com.isa.bookcase.domain.Book;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class BookRepositoryBean implements BookRepository {
    @Override
    public List<Book> findAll() {
        return new Books().getBooks();
    }
}
