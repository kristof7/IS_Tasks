package com.isa.bookcase.service;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.repository.Books;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class Library {

    @EJB
    private Books books;

    public List<Book> displayAllBooks() { return books.getBooks(); }
}
