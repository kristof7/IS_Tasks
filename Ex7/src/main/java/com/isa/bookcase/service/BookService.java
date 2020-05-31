package com.isa.bookcase.service;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.domain.Category;
import com.isa.bookcase.repository.Books;

import java.util.*;
import java.util.stream.Collectors;

public class BookService {

    private final List<Book> books = new Books().getBooks();

    public List<Book> getBooksForKids(){
        return books.stream()
                .filter(Book::isForKids)
                .collect(Collectors.toList());
    }
    public List<Book> getBooksForAuthorStartingWithJ(){
        return books.stream()
                .filter(book -> book.getAuthor().startsWith("J"))
                .collect(Collectors.toList());
    }
    public List<String> getBookTitlesContainingCi(){
        return books.stream()
                .map(Book::getTitle)
                .filter(book -> book.toLowerCase().contains("ci"))
                .collect(Collectors.toList());
    }
    public Integer getSumForPagesOfAllBooks(){
        return books.stream()
                .mapToInt(Book::getPages)
                .sum();
    }
    public List<Book> getThreeShortestBooksWithPages(){
        return books.stream()
                .sorted(Comparator.comparingInt(Book::getPages))
                .limit(3)
                .collect(Collectors.toList());
    }
    public List<String> getThreeLongestBookTitles(){
        return books.stream()
                .sorted(Comparator.comparingInt(Book::getPages).reversed())
                .limit(3)
                .map(Book::getTitle).collect(Collectors.toList());
    }
    public String getBookWithLongestTitle(){
        return books.stream()
                .map(Book::getTitle)
                .max(Comparator.comparingInt(String::length))
                .get();
    }
    public List<Book> getBooksSortedByPagesAsc(){
        return books.stream()
                .sorted(Comparator.comparingInt(Book::getPages))
                .collect(Collectors.toList());
    }
    public Map<Category, List<Book>> getBooksSortedByCategory(){
        return books.stream()
                .collect(Collectors.groupingBy(Book::getCategory));
    }
    public Map<Category, Optional<Book>> getLongestBookInEachCategory(){
        return books.stream()
                .collect(Collectors.groupingBy(Book::getCategory,Collectors.maxBy(Comparator.comparingInt(Book::getPages))));
    }
}
