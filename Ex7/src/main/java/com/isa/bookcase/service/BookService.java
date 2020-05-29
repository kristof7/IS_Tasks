package com.isa.bookcase.service;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.domain.Category;
import com.isa.bookcase.repository.Books;

import java.util.*;
import java.util.stream.Collectors;

public class BookService {

    private final List<Book> books = new Books().getBooks();


    public List<Book> booksForKids(){

        return books.stream()
            .filter(book -> book.isForKids())
            .collect(Collectors.toList());
    }

    public List<Book> bookAuthorStartsWithChar(){

        return books.stream()
            .filter(book -> book.getAuthor().startsWith("J"))
            .collect(Collectors.toList());
    }

    public List<String> bookTitlesWithFragment(){

        return books.stream()
            .filter(book -> book.getTitle().contains("ci"))
            .map(book -> book.getTitle())
            .collect(Collectors.toList());
    }

    public Integer sumOfPages(){

        return books.stream()
            .mapToInt(book -> book.getPages())
            .sum();
    }

    public List<Book> threeShortestBooks(){

        return books.stream()
            .sorted(Comparator.comparing(Book::getPages))
            .limit(3)
            .collect(Collectors.toList());
    }

    public List<String> threeLongestBooks(){

        return books.stream()
            .sorted(Comparator.comparing(Book::getPages, Comparator.reverseOrder()))
            .limit(3)
            .map(book -> book.getTitle())
            .collect(Collectors.toList());
    }

    public String bookWhitTheLongestTitle(){
        return books.stream()
            .sorted(Comparator.comparing(book -> book.getTitle().length(),Comparator.reverseOrder()))
            .map(Book::getTitle)
            .findFirst()
            .orElse("This shouldn't happen");
    }

    public List<Book> booksSortedByPagesAsc(){
        return books.stream()
            .sorted(Comparator.comparing(Book::getPages))
            .collect(Collectors.toList());
    }

    public Map<Category, List<Book>> booksByCategory(){
        return books.stream()
            .collect(Collectors.groupingBy(Book::getCategory));
    }
}
