package com.isa.bookcase.service;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.repository.Books;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BookService {

    private final List<Book> books = new Books().getBooks();

    public List<Book> bookForKids() {
        return books.stream()
                .filter(book -> book.isForKids())
                .collect(Collectors.toList());
    }

    public List<Book> theAuthorIsJ() {
        return books.stream().filter(book -> book.getAuthor()
                .startsWith("J"))
                .collect(Collectors.toList());
    }

    public List<Book> titleforCi() {
        return books.stream().filter(book -> book.getTitle()
                .endsWith("ci"))
                .collect(Collectors.toList());
    }

    // 4. oblicz ile stron mają wszystkie książki razem
    public Integer sumPagesBook() {
        Integer sumOfPages = books.stream()
                .flatMapToInt(book -> IntStream
                        .of(book.getPages()))
                .sum();
        return sumOfPages;
        // TODO dodaj odpowiednią metodę w klasie BookService
    }
}

