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

    public List<Book> findBooksForKids(){
        return books.stream()
                .filter(Book::isForKids)
                .collect(Collectors.toList());
    }

    public  List<Book> findBookAutorOn(String letter){
        return books.stream()
                .filter(a-> a.getAuthor().startsWith(letter))
                .collect(Collectors.toList());
    }

    public List<String> findBookWithFragment(String fragment) {
        return books.stream()
                .filter(b -> b.getTitle().contains(fragment))
                .map(Book::getTitle)
                .collect(Collectors.toList());
    }

    public Integer countSumOfPages(){
        return books.stream()
                .map(Book::getPages)
                .reduce(0, Integer::sum);
    }

    public List<Book>findShortestBooks(Integer limitOfBooks){
        return books.stream()
                .sorted(Comparator.comparing(Book::getPages))
                .limit(limitOfBooks)
                .collect(Collectors.toList());
    }

    public List<String>findLongestBooks(Integer limitOfBooks){
        return books.stream()
                .sorted(Comparator.comparing(Book::getPages).reversed())
                .limit(limitOfBooks)
                .map(Book::getTitle)
                .collect(Collectors.toList());

    }

    public String bookWithLongestTitle(){
        return books.stream()
                .max(Comparator.comparing(p->p.getTitle().length()))
                .map(book -> book.getTitle())
                .get();
    }

    public List<Book> sortedListByPages(){
        return  books.stream()
                .sorted(Comparator.comparing(Book::getPages))
                .collect(Collectors.toList());
    }

    public Map<Category, List<Book>> findBooksByCategory(){
        return books.stream()
                .collect(Collectors.groupingBy(n -> n.getCategory()));
    }

    public Map<Category, Optional<Book>> findLongestBookInEachCategory(){
        return books.stream()
                .collect(Collectors.groupingBy(
                        Book::getCategory, Collectors.maxBy(
                                Comparator.comparingInt(Book::getPages))));

    }
}
