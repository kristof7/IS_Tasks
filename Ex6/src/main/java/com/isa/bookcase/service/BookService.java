package com.isa.bookcase.service;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.repository.BooksRepository;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import java.util.List;
import java.util.Optional;

@RequestScoped
public class BookService {

    @EJB
    private BooksRepository booksRepository;

    public List findByAuthor(String author){return booksRepository.findByAuthor(author);}

    public List findByTitle(String title) {return booksRepository.findByTitle(title);}

    public List findAll(){return booksRepository.findAll();}

    public Book randomBook(){return booksRepository.randomBook();}





}
