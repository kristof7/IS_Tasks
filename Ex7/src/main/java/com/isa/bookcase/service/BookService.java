package com.isa.bookcase.service;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.domain.Category;
import com.isa.bookcase.repository.Books;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BookService {

    private final List<Book> books = new Books().getBooks();

    //  1. znajdź tylko książki dla dzieci
    public List<Book> booksForKids() {
        return books.stream()
                .filter(Book::isForKids)
                .collect(Collectors.toList());
    }

    // 2. znajdź książki, których autor zaczyna się na literę "J"
    public List<Book> booksAuthorStartsWithChar() {
        return books.stream()
                .filter(book -> book.getAuthor().startsWith("J"))
                .collect(Collectors.toList());
    }

    // 3. znajdź tytuły książek, które zawiera frazę "ci"
    public List<String> booksTitlesWithFragment() {
        return books.stream()
                .filter(book -> book.getTitle().contains("ci"))
                .map(Book::getTitle)
                .collect(Collectors.toList());
    }

    // 4. oblicz ile stron mają wszystkie książki razem
    public Integer sumOfPages() {
        return books.stream()
                .map(Book::getPages)
                .reduce(0, Integer::sum);
    }

    // 5. znajdź 3 najkrótsze książki
    public List<Book> threeShortestBooks() {
        return books.stream()
                .sorted(Comparator.comparingInt(Book::getPages))
                .limit(3)
                .collect(Collectors.toList());
    }

    // 6. znajdź tytuły 3 książek, które mają największą liczbę stron
    public List<String> titlesOfThreeLongestBooks() {
        return books.stream()
                .sorted(Comparator.comparingInt(Book::getPages).reversed())
                .limit(3)
                .map(Book::getTitle)
                .collect(Collectors.toList());
    }

    // 7. znajdź książkę o najdłuższym tytule
    public String bookWithLongestTitle() {
        return books.stream()
                .map(book -> book.getTitle())
                .max(Comparator.comparingInt(String::length))
                .orElse("empty");
    }

    // 8. wypisz książki (tytuły  i liczbę stron) posortowane wg rosnącej liczby stron
    public List<Book> booksSortedByPagesAsc() {
        return books.stream()
                .sorted(Comparator.comparingInt(Book::getPages))
                .collect(Collectors.toList());
    }

    // 9. podziel książki wg gatunku
    public Map<Category, List<Book>> booksByCategory() {
        return books.stream()
                .collect(Collectors.groupingBy(Book::getCategory));
    }

    // 10. znajdź najdłuższą książkę w każdym gatunku
//    public Map<Category, Optional<Book>> longestBookInEachCategory() {
//        return books.stream()

//                .collect(Collectors.toMap(Book::getCategory, Function.identity(), (existing, limit) -> existing)))
//
//                        ??

//                .collect(Collectors.groupingBy(Book::getCategory))
//                .entrySet()
//                .stream()
//                .flatMap(books -> books.getValue().stream())
//                .max(Comparator.comparingInt(Book::getPages))
//                .stream()
//                .collect((Collectors.toMap(Book::getCategory, Function.identity()));

//                            ??
//    }

}
