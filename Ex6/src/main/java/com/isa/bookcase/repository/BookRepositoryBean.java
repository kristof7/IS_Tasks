package com.isa.bookcase.repository;

import com.isa.bookcase.domain.Book;

import javax.ejb.Stateless;
import java.util.List;
import java.util.Optional;

@Stateless
public class BookRepositoryBean implements BookRepository {

    @Override
    public Optional<Book> findByAuthor(String author) {
        return findAll().stream().filter(book -> book.getAuthor().startsWith(author)).findAny();
    }

    @Override
    public Optional<Book> findByTitle(String title) {
        return findAll().stream().filter(book -> book.getTitle().startsWith(title)).findAny();
    }

    @Override
    public Optional<Book> findByAuthorAndTitle(String author, String title) {
        return findAll().stream().filter(book1 -> book1.getTitle().startsWith(title) && book1.getAuthor().startsWith(author)).findAny();
    }

    @Override
    public List<Book> findAll() {
        return new Books().getBooks();
    }
}
