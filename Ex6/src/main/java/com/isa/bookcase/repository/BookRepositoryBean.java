package com.isa.bookcase.repository;

import com.isa.bookcase.domain.Book;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class BookRepositoryBean implements BookRepository {

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> bookListA = new ArrayList<>();
        findAll().stream().filter(book -> book.getAuthor().startsWith(author)).forEach(book -> bookListA.add(book));
        return bookListA;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> bookListT = new ArrayList<>();
        findAll().stream().filter(book -> book.getTitle().startsWith(title)).forEach(book -> bookListT.add(book));
        return bookListT;
    }

    @Override
    public List<Book> findByAuthorAndTitle(String author, String title) {
        List<Book> bookListAT = new ArrayList<>();
        findAll().stream().filter(book -> book.getTitle().startsWith(title) && book.getAuthor().startsWith(author)).forEach(book -> bookListAT.add(book));
        return bookListAT;
    }

    @Override
    public List<Book> findAll() {
        return new Books().getBooks();
    }
}
