package com.isa.bookcase.service;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.domain.Category;
import com.isa.bookcase.repository.Books;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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

    public List<String> bookTitlesWithFragment() {
        return books.stream()
                .filter(book -> book.getTitle().contains("ci"))
                .map(Book::getTitle)
                .collect(Collectors.toList());
    }

    public Integer sumOfPages() {
        return books.stream().
                map(Book::getPages).
                reduce(0, (integer, integer2) -> integer + integer2);
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

    public Book bookWithLongestTitle() {
        return books.stream()
                .max(Comparator.comparingInt(book -> book.getTitle().length()))
                .orElse(null);
    }

    public List<Book> booksSortedByPagesAsc() {
        return books.stream()
                .sorted(Comparator.comparingInt(Book::getPages))
                .collect(Collectors.toList());
    }

    public Map<Category, List<Book>> booksByCategory(){
        return books.stream().collect(Collectors.groupingBy(Book::getCategory));
    }

    public Map<Category, Optional<Book>> longestBookInEachCategory() {
        return books.stream().collect(Collectors.groupingBy(Book::getCategory, Collectors.maxBy(Comparator.comparingInt(Book::getPages))));
    }
}

