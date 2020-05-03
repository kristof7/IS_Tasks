package com.isa.bookcase.repository;

import com.isa.bookcase.domain.Book;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class BookRepositoryBean implements BookRepository {

    @EJB
    private Books books;

    @Override
    public List<Book> findByAuthor(String author) {
        return findAll().stream().filter(book -> book.getAuthor().contains(author)).collect(Collectors.toList());
    }

    @Override
    public List<Book> findAll() {
        return books.getBooks();
    }

    @Override
    public List<Book> findByTitle(String title) {
        return findAll().stream().filter(book -> book.getTitle().contains(title)).collect(Collectors.toList());
    }

    @Override
    public Book randomBook() {
        int random = (int) (Math.random() * books.getBooks().size());
        return books.getBooks().get(random);
    }
}
