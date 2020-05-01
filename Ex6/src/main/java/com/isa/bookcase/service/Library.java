package com.isa.bookcase.service;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.repository.Books;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import java.util.List;

@RequestScoped
public class Library {
    @EJB
    private Books books;

   // public List<Book> displayAllBooks() { return books.getBooks(); }

    public List<Book> displayAllBooks() { return books.getBooks(); }
}
