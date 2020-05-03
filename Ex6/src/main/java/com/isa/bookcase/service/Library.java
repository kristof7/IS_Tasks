package com.isa.bookcase.service;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.repository.Books;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequestScoped
public class Library {

    @EJB
    private Books books;
    private Book book;

    public List<Book> displayAllBooks() { return books.getBooks(); }

//    public List<Book> displayByAuthor(String author) {
//        List<Book> findedBooks = new ArrayList<Book>();
//
//        displayAllBooks().stream()
//                .filter(book -> book.getAuthor().startsWith(author)).forEachOrdered(findedBooks::add);
//
//        return findedBooks;
//    }
}
