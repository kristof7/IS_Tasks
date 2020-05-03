package com.isa.bookcase.service;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.repository.Books;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import java.util.List;

@RequestScoped
public class BooksService {

    @EJB
    private Books books;

    public int returnRepositorySize() {
        return books.getBooks().size();
    }

    public List<Book> showAllBooks() {
        return books.getBooks();
    }
}
