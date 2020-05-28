package com.isa.bookcase.service;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.domain.Category;
import com.isa.bookcase.repository.Books;

import java.util.*;
import java.util.stream.Collectors;

public class BookService {

    private final List<Book> books = new Books().getBooks();

    public List<Book> findBooksForKids() {
        return books.stream()
                .filter(Book::isForKids)
                .collect(Collectors.toList());
    }

    public List<Book> findBooksAuthorStartsWithChar() {

        return books.stream()
                .filter(book -> book.getAuthor().startsWith("J"))
                .collect(Collectors.toList());
    }

    public List<String> findBookTitlesWithFragment() {

        return books.stream()
                .filter(book -> book.getTitle().contains("ci"))
                .map(Book::getTitle)
                .collect(Collectors.toList());
    }

    public Integer findSumOfPages() {

        return books.stream()
                .map(Book::getPages)
                .reduce(0, Integer::sum);
    }

    public List<Book> findThreeShortestBooks() {

        return books.stream()
                .sorted(Comparator.comparing(Book::getPages))
                .limit(3)
                .collect(Collectors.toList());
    }

    public List<String> findTitlesOfThreeLongestBooks() {

        return books.stream()
                .sorted(Comparator.comparing(Book::getPages).reversed())
                .limit(3)
                .map(Book::getTitle)
                .collect(Collectors.toList());
    }

    public String findBookWithLongestTitle() {

        return books.stream()
                .map(Book::getTitle)
                .max(Comparator.comparing(String::length))
                .get();
    }

    public List<Book> findBooksSortedByPagesAsc() {

        return books.stream()
                .sorted(Comparator.comparing(Book::getPages))
                .collect(Collectors.toList());
    }

    public Map<Category, List<Book>> findBooksByCategory() {

        return books.stream()
                .collect(Collectors.groupingBy(Book::getCategory));
    }

    public Map<Category, Optional<Book>> findLongestBookInEachCategory() {

        return books.stream()
                .collect(Collectors.groupingBy(Book::getCategory, Collectors.maxBy
                        (Comparator.comparing(Book::getPages))));
    }

}
