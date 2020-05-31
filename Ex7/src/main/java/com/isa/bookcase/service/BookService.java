package com.isa.bookcase.service;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.domain.Category;
import com.isa.bookcase.repository.Books;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class BookService {

    private final List<Book> books = new Books().getBooks();

    public List<Book> getBooks() {
        return books;
    }

    public List<Book> getBooksForKids() {
        return getBooks().stream().filter(Book::isForKids).collect(Collectors.toList());
    }

    public List<Book> getBooksAuthorStartsWithChar(String charFilter) {
        return getBooks().stream().filter(book -> book.getAuthor().startsWith(charFilter)).collect(Collectors.toList());
    }

    public List<String> getBooksTitlesWithFragment(String fragmentFilter) {
        return getBooks().stream()
                .filter(book -> book.getTitle().contains(fragmentFilter))
                .map(Book::getTitle)
                .collect(Collectors.toList());
    }

    public Integer sumAllNumberOfPages() {
        return getBooks().stream()
                .mapToInt(Book::getPages)
                .sum();
    }

    public List<Book> getNumberOfShortestBook (Integer numberOfBooks) {
        return getBooks().stream()
                .sorted()
                .limit(numberOfBooks)
                .collect(Collectors.toList());
    }

    public List<String> getTitlesOfNumberLongestBooks (Integer numberOfBooks) {
        return getBooks().stream()
                .sorted((a1, b1) -> (b1.getPages() - a1.getPages()))
                .limit(numberOfBooks)
                .map(Book::getTitle)
                .collect(Collectors.toList());
    }

    public String getTitleOfBookWithLongestTitle() {
        return getBooks().stream()
                .sorted((a1,b1) -> (b1.getTitle().length() - a1.getTitle().length()))
                .limit(1)
                .map(Book::getTitle)
                .max(Comparator.comparing(String::length))
                .get();

    }

    public List<Book> sortByPagesAsc() {
        return getBooks().stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public Map<Category, List<Book>> groupBooksByCategory() {
        return getBooks().stream()
                .collect(groupingBy(Book::getCategory));
    }

    public Map<Category, Optional<Book>> getLongestBookInEachCategory() {
        return getBooks().stream()
                .collect(Collectors.groupingBy(Book::getCategory, Collectors.maxBy(Comparator.comparingInt(Book::getPages))));
    }

}
