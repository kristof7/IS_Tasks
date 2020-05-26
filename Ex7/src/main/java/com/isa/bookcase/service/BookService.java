package com.isa.bookcase.service;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.domain.Category;
import com.isa.bookcase.repository.Books;

import java.util.*;
import java.util.stream.Collectors;

public class BookService {

    private final List<Book> books = new Books().getBooks();
    Comparator<Book> pageComparator = (b1, b2) -> b1.getPages() - b2.getPages();
    Comparator<Book> titleComparator = (b1, b2) -> b1.getTitle().length() - b2.getTitle().length();

    public void booksForKids() {

        List<Book> booksForKids = books.stream()
                .filter(book -> book.isForKids())
                .collect(Collectors.toList());

        booksForKids.forEach(System.out::println);
    }

    public void booksAuthorStartsWithChar() {

        List<Book> booksAuthorStartsWithChar = books.stream()
                .filter(book -> book.getAuthor().startsWith("J"))
                .collect(Collectors.toList());

        booksAuthorStartsWithChar.forEach(System.out::println);
    }

    public void bookTitlesWithFragment() {

        List<String> bookTitlesWithFragment = books.stream()
                .filter(book -> book.getTitle().contains("ci"))
                .map(Book::getTitle)
                .collect(Collectors.toList());

        bookTitlesWithFragment.forEach(System.out::println);
    }

    public void sumOfPages() {

        Integer sumOfPages = books.stream()
                .map(Book::getPages)
                .reduce(0, (a1, a2) -> a1 + a2);

        System.out.println(sumOfPages);
    }

    public void threeShortestBooks() {

        List<Book> threeShortestBooks = books.stream()
                .sorted(pageComparator)
                .limit(3)
                .collect(Collectors.toList());

        threeShortestBooks.forEach(System.out::println);
    }

    public void titlesOfThreeLongestBooks() {

        List<String> threeShortestBooks = books.stream()
                .sorted(pageComparator.reversed())
                .limit(3)
                .map(Book::getTitle)
                .collect(Collectors.toList());

        threeShortestBooks.forEach(System.out::println);
    }

    public void bookWithLongestTitle() {

        String bookWithLongestTitle = books.stream()
                .sorted(titleComparator.reversed())
                .map(Book::getTitle)
                .findFirst().get();

        System.out.println(bookWithLongestTitle);
    }

    public void booksSortedByPagesAsc() {

        List<Book> booksSortedByPagesAsc = books.stream()
                .sorted(pageComparator)
                .collect(Collectors.toList());

        booksSortedByPagesAsc.forEach(System.out::println);
    }

    public void booksByCategory() {

        Map<Category, List<Book>> booksByCategory = books.stream()
                .collect(Collectors.groupingBy(Book::getCategory));

        Set<Map.Entry<Category, List<Book>>> entrySet = booksByCategory.entrySet();
        entrySet.stream()
                .collect(Collectors.toSet());

        entrySet.forEach(System.out::println);
    }

    public void longestBookInEachCategory() {

        Map<Category, Optional<Book>> longestBookInEachCategory = books.stream()
                .collect(Collectors.groupingBy(Book::getCategory, Collectors.maxBy(titleComparator)));

        Set<Map.Entry<Category, Optional<Book>>> entrySet = longestBookInEachCategory.entrySet();
        entrySet.stream()
                .collect(Collectors.toSet());

        entrySet.forEach(System.out::println);
    }

}
