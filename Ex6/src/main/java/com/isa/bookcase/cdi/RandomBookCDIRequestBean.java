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

    public Book getRandomBook() {
        int bound = books.getBooks().size();

        int rand = new Random().nextInt(bound);

        return books.getBooks().get(rand);
    }
}
