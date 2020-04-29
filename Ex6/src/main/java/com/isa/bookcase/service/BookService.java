package com.isa.bookcase.service;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.repository.Books;
import com.isa.bookcase.repository.BooksRepository;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import java.util.Comparator;
import java.util.List;

@RequestScoped
public class BookService {
    @EJB
    BooksRepository booksRepository;

    public List findAll() {
        return booksRepository.findAll();
    }

    public List writeRandomBook() {
        return booksRepository.writeRandomBook();
    }
}
