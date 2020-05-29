package com.isa.bookcase.service;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.domain.Category;
import com.isa.bookcase.repository.Books;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookService {

    private final List<Book> books = new Books().getBooks();

    public List<Book> isForKidsList(List<Book> bookList) {
        books.stream()
                .filter(Book::isForKids)
                .forEach(bookList::add);
        return bookList;
    }

    public List<Book> authorStartsWithJ(List<Book> bookList) {
        books.stream()
                .filter(book -> book.getAuthor().startsWith("J"))
                .forEach(bookList::add);
        return bookList;
    }

    public List<String> containsCi(List<String> list) {
        books.stream()
                .filter(book -> book.getTitle().contains("ci"))
                .forEach(book -> list.add(book.getTitle()));
        return list;
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

}

