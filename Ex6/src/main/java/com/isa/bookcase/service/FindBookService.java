package com.isa.bookcase.service;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.repository.Books;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import java.util.List;

@RequestScoped
public class FindBookService {

    @EJB
    Books books;

    public List<Book> findBookByAuthor(String name) {
        return books.findByAuthorsName(name);
    }

    public List<Book> findBookByTittle(String tittle) {
        return books.findByTittle(tittle);
    }
}
