package com.isa.bookcase.service;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.domain.Category;
import com.isa.bookcase.repository.Books;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.stream.Collectors;

public class BookService {

    private final List<Book> books = new Books().getBooks();

    public List <Book> findBooksForKids(){
        return books.stream()
                .filter(Book::isForKids)
                .collect(Collectors.toList());
    }

    public List<Book> booksAuthorStartsWithChar(String letter){
        return books.stream()
                .filter(book -> book.getAuthor().startsWith(letter))
                .collect(Collectors.toList());

    }

    public List<String> bookTitlesWithFragment(String fragment){
        return books.stream()
                .map(Book::getTitle)
                .filter(title -> title.contains(fragment))
                .collect(Collectors.toList());
    }

    public Integer sumOfPages(){
        return books.stream()
                .map(Book::getPages)
                .reduce(0,Integer::sum);

    }

    Comparator<Book> pagesComparator = Comparator.comparingInt(Book::getPages);

    public List<Book> findThreeShortestBooks(){
        return books.stream()
                .sorted(pagesComparator)
                .limit(3)
                .collect(Collectors.toList());
    }
    
    public List<String> findTitlesOfThreeLongestBooks(){
        return books.stream()
                .sorted(pagesComparator.reversed())
                .map(Book::getTitle)
                .limit(3)
                .collect(Collectors.toList());
        
    }

    Comparator<Book> titleComparator = Comparator.comparingInt(t->t.getTitle().length());

    public String findbookWithLongestTitle(){
        return books.stream()
                .sorted(titleComparator.reversed())
                .map(Book::getTitle)
                .findFirst()
                .orElse("We don't find it");

    }

    public List<Book> sortBooksByPages(){
        return books.stream()
                .sorted(pagesComparator)
                .collect(Collectors.toList());

    }

    public Map<Category, List<Book>> sortBooksByCategory(){
        return books.stream()
                .collect(Collectors.groupingBy(Book::getCategory));
    }

    public Map<Category, Optional<Book>> longestBookInEachCategory(){
        return books.stream()
                .collect(Collectors.groupingBy(Book::getCategory, Collectors.maxBy(pagesComparator)));
    }

}
