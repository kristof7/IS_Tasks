package com.isa.bookcase.service;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.repository.BookRepository;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import java.util.List;

@RequestScoped
public class BookService {

    @EJB
    private BookRepository bookRepository;

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Book getRandomBook() {
        return bookRepository.getRandomBook();
    }

    public List<Book> getBooksListByAuthor(String author) {
        return bookRepository.getBooksListByAuthor(author);
    }

    public Book getBookByAuthor(String author) {
        return bookRepository.getBookByAuthor(author).orElse(null);
    }

    public List<Book> getBooksListByTitle(String title) {
        return bookRepository.getBooksListByTitle(title);
    }

    public Book getBookByTitle(String title) {
        return bookRepository.getBookByTitle(title).orElse(null);
    }



}


