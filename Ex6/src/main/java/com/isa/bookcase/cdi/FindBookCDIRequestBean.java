package com.isa.bookcase.cdi;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.repository.Books;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequestScoped
public class FindBookCDIRequestBean {

    @EJB
    private Books books;

    public List<Book> displayByAuthor(String author) {
        List<Book> findedBooks = new ArrayList<Book>();

        books.getBooks().stream()
                .filter(book -> book.getTitle().startsWith(Optional.ofNullable(author).orElse("0"))).forEachOrdered(findedBooks::add);

        return findedBooks;
    }

    public List<Book> displayByTitle(String title) {
        List<Book> findedBooks = new ArrayList<Book>();

        books.getBooks().stream()
                .filter(book -> book.getTitle().startsWith(Optional.ofNullable(title).orElse("0"))).forEachOrdered(findedBooks::add);

        return findedBooks;
    }
}
