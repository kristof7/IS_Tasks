package com.isa.bookcase.cdi;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.repository.Books;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import java.util.Random;

@RequestScoped
public class RandomBookCDIRequestBean {
    @EJB
    private Books books;

    int rand = new Random().nextInt(12);

    public Book getRandomBook() {

        return books.getBooks().get(rand);
    }
}
