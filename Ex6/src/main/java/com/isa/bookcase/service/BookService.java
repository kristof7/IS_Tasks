package com.isa.bookcase.service;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.repository.BooksRepository;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import java.util.List;

@RequestScoped
public class BookService {

    @EJB
    private BooksRepository booksRepository;

    public Book findByAuthor(String author){return booksRepository.findByAuthor(author).orElse(null);}

    public List findAll(){return booksRepository.findAll();}

    public Book randomBook(){return booksRepository.randomBook();}





}
