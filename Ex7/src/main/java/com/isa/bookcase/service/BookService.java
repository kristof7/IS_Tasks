package com.isa.bookcase.service;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.repository.Books;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {

    private final List<Book> books = new Books().getBooks();

    public List<Book> booksForKids() {
        return books.stream()
                .filter(Book::isForKids)
                .collect(Collectors.toList());
    }

    public List<Book> booksAuthorStartsWithChar() {
        return books.stream()
                .filter(book -> book.getAuthor().startsWith("J"))
                .collect(Collectors.toList());
    }

    public List<String> booksTitlesWithFragment() {
        return books.stream()
                .filter(book -> book.getTitle().contains("ci"))
                .map(Book::getTitle)
                .collect(Collectors.toList());
    }

    public Integer sumOfPages() {
        return books.stream()
                .map(Book::getPages)
                .reduce(0, Integer::sum);
    }

    public List<Book> threeShortestBooks() {
        return books.stream()
                .sorted(Comparator.comparingInt(Book::getPages))
                .limit(3)
                .collect(Collectors.toList());
    }

    public List<String> titlesOfThreeLongestBooks() {
        return books.stream()
                .sorted(Comparator.comparingInt(Book::getPages).reversed())
                .limit(3)
                .map(Book::getTitle)
                .collect(Collectors.toList());
    }

    public String bookWithLongestTitle() {
        return "Tytuł";
//                .map(book -> book.getTitle())
//                .max(Comparator.comparing(String::length))
//                .ifPresent(book -> book.toString());
    }

}
