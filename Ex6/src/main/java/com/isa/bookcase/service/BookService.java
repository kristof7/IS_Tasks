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


    public List<Book> findAll(){

        return bookRepository.findAll();
    }

    public Book getRandomBook(){

        return bookRepository.getRandomBook();
    }

    public List<Book> findByAuthor(String author) {

        return bookRepository.findByAuthor(author);
    }

    public List<Book> findByAuthorAndTitle(String author, String title) {

        return bookRepository.findByAuthorAndTitle(author, title);
    }
}
