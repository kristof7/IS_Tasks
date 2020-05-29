package com.isa.bookcase.service;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.domain.Category;
import com.isa.bookcase.repository.Books;

import java.util.*;
import java.util.stream.Collectors;

public class BookService {

    private final List<Book> books = new Books().getBooks();

    Comparator<Book> pagesComparator = Comparator.comparingInt(Book::getPages);
    Comparator<Book> tittleLengthComparator = Comparator.comparingInt(b -> b.getTitle().length());

    public List<Book> findBooksForKids() {
        return books.stream().filter(Book::isForKids)
                .collect(Collectors.toList());
    }

    public List<Book> findBooksThatAuthorStarts(String letter) {
        return books.stream().filter(book -> book.getAuthor().startsWith(letter))
                .collect(Collectors.toList());
    }

    public List<String> findBookWithTittleContent(String content) {
        return books.stream()
                .map(Book::getTitle)
                .filter(title -> title.contains(content))
                .collect(Collectors.toList());
    }

    public Integer sumAllBooksPages() {
        return books.stream()
                .map(Book::getPages)
                .reduce(0, Integer::sum);
    }


    public List<Book> findShortestBooks(Long listLimit) {
        return books.stream()
                .sorted(pagesComparator)
                .limit(listLimit)
                .collect(Collectors.toList());
    }

    public List<String> findTittleLongestBooks(Long listLimit) {
        return books.stream()
                .sorted(pagesComparator.reversed())
                .map(Book::getTitle)
                .limit(listLimit)
                .collect(Collectors.toList());
    }

    public String findBookWithLongestTittle() {
        return books.stream()
                .sorted(tittleLengthComparator.reversed())
                .map(Book::getTitle)
                .findFirst()
                .orElse("not found");
    }

    public List<Book> sortBooksAscOrderByPages() {
        return books.stream()
                .sorted(pagesComparator)
                .collect(Collectors.toList());
    }

    public Map<Category, List<Book>> divideBooksByCategory() {
        return books.stream()
                .collect(Collectors.groupingBy(Book::getCategory));
    }

    public Map<Category, Optional<Book>> findLongestBookInEveryCategory() {
        return books.stream()
                .collect(Collectors.groupingBy
                        (Book::getCategory, Collectors.maxBy
                                (pagesComparator)));
    }
}
