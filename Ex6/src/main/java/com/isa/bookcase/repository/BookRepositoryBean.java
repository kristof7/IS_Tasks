package com.isa.bookcase.repository;

import com.isa.bookcase.domain.Book;

import javax.ejb.Stateless;
import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class BookRepositoryBean implements BookRepository {

    @Override
    public List<Book> findByAuthor(String author) {
        return findAll().stream().filter(book -> book.getAuthor().startsWith(author.toUpperCase())).collect(Collectors.toList());
    }

    @Override
    public List<Book> findByTitle(String title) {
        return findAll().stream().filter(book -> book.getTitle().startsWith(title.toUpperCase())).collect(Collectors.toList());
    }

    @Override
    public List<Book> findByAuthorAndTitle(String author, String title) {
        return findAll().stream().filter(book -> book.getTitle().startsWith(title.toUpperCase()) && book.getAuthor().startsWith(author.toUpperCase())).collect(Collectors.toList());
    }

    @Override
    public List<Book> findAll() {
        return new Books().getBooks();
    }

}
