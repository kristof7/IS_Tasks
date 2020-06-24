package com.isa.bookcase.service;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.domain.Category;
import com.isa.bookcase.repository.Books;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.isa.bookcase.domain.Category.values;

public class BookService {

    private final List<Book> books = new Books().getBooks();

    //  1. znajdź tylko książki dla dzieci
    public List<Book> findBookForKids() {
        return books.stream()
                .filter(Book::isForKids)
                .collect(Collectors.toList());
    }

    // 2. znajdź książki, których autor zaczyna się na literę "J"
    public List<Book> findTheAuthorIsJ() {
        return books.stream().filter(book -> book.getAuthor()
                .startsWith("J"))
                .collect(Collectors.toList());
    }

    // 3. znajdź tytuły książek, które zawiera frazę "ci"
    public List<Book> findTitleforCi() {
        return books.stream().filter(book -> book.getTitle()
                .contains("ci"))
                .collect(Collectors.toList());
    }

    // 4. oblicz ile stron mają wszystkie książki razem
    public Integer sumPagesBook() {
        int sumOfPages;
        sumOfPages = books.stream()
                .flatMapToInt(book -> IntStream
                        .of(book.getPages()))
                .sum();
        return sumOfPages;

    }

    // 5. znajdź 3 najkrótsze książki
    public List<Book> findTheLongestBook() {
        return books.stream()
                .sorted(Comparator
                        .comparingInt(Book::getPages))
                .limit(3)
                .collect(Collectors.toList());
    }

    // 6. znajdź tytuły 3 książek, które mają największą liczbę stron
    public List<Book> findTitlesOfLongestBooks() {
        return books.stream()
                .sorted(Comparator.comparingInt(Book::getPages).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    //  7. znajdź książkę o najdłuższym tytule
    public String bookWithLongestTitle() {
        return books.stream().map(Book::getTitle).max(Comparator.comparing(String::length)).get();
    }


    // 8. wypisz książki (tytuły  i liczbę stron) posortowane wg rosnącej liczby stron
    public List<Book> booksSortedByPagesAsc() {
        return books.stream()
                .sorted(Comparator
                        .comparingInt(Book::getPages).reversed())
                .collect(Collectors.toList());
    }

    //   9. podziel książki wg gatunku
    public Map<Category, List<Book>> booksByCategory() {
        return books.stream().collect(Collectors.groupingBy(Book::getCategory));
    }

    // 10. znajdź najdłuższą książkę w każdym gatunku
    public Map<Category, Optional<Book>> findLongestBookByCategory() {
        return books.stream()
                .collect(Collectors.groupingBy(Book::getCategory, Collectors.maxBy(Comparator.comparingInt(Book::getPages))));
    }
}
