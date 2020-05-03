package com.isa.bookcase.repository;


import com.isa.bookcase.domain.Book;

import javax.ejb.Stateless;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Stateless

public class BookRepositoryBean implements BookRepository {


    @Override
    public List<Book> findAll() {
        return new Books().getBooks();
    }

    @Override
    public Book getRandomBook() {
        return new Books().getBooks().get(new Random().nextInt(new Books().getBooks().size()));
    }
    @Override
    public Optional<Book> findByAuthor(String author) {
        return findAll().stream()
                .filter(book -> book.getAuthor().equals(author)).findFirst();
    }

    @Override
    public Optional< Book> findByTitle(String title) {
        return findAll().stream()
                .filter(book -> book.getTitle().equals(title)).findFirst();
    }


    }

