package com.isa.bookcase.service;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.repository.BookRepository;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

@RequestScoped
public class BookService {

    @EJB
    private BookRepository bookRepository;

    public Book findByAuthor(String author)
    {
        return bookRepository.findByAuthor(author).orElse(null);
    }
    public Book findByTitle(String title)
    {
        return bookRepository.findByTitle(title).orElse(null);
    }
    public Book findByAuthorAndTitle(String author, String title)
    {
        return bookRepository.findByAuthorAndTitle(author,title).orElse(null);
    }

}
