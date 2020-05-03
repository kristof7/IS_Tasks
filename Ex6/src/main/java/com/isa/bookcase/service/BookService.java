package com.isa.bookcase.service;


import com.isa.bookcase.domain.Book;
import com.isa.bookcase.repository.BooksRepository;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import java.util.List;
import java.util.Random;

@RequestScoped
public class BookService {

    @EJB
    BooksRepository booksRepository;

    public List showAllBooks() {
        return booksRepository.showAllBooks();
    }

    public Book showRandomBook() {
        return booksRepository.showRandomBook();
    }

    public Book findByAuthor(String author) {
        return booksRepository.findByAuthor(author).orElse(null);
    }

    public Book findByTitle(String title) {
        return booksRepository.findByTitle(title).orElse(null);
    }

}
