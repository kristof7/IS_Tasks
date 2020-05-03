package com.isa.bookcase.repository;

import com.isa.bookcase.domain.Book;

import javax.ejb.Stateless;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

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
    public List<Book> getBooksListByAuthor(String author) {
        return findAll().stream()
                .filter(book -> book.getAuthor().contains(author)).collect(Collectors.toList());
    }

    @Override
    public Optional<Book> getBookByAuthor(String author) {
        return findAll().stream()
                .filter(book -> book.getAuthor().contains(author)).findFirst();
    }
}
