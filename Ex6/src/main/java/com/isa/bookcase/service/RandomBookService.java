package com.isa.bookcase.service;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.repository.Books;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import java.util.concurrent.ThreadLocalRandom;

@RequestScoped
public class RandomBookService {

    @EJB
    Books books;

    public Book RandomBook() {
        return books.getBooks().get(randomBookIndex());
    }

    public int randomBookIndex() {
        int max = books.getBooks().size();
        return ThreadLocalRandom.current().nextInt(0, max);
    }
}
