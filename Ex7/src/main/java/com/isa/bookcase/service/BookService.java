package com.isa.bookcase.service;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.domain.Category;
import com.isa.bookcase.repository.Books;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BookService {

    private final List<Book> books = new Books().getBooks();

    //  1. znajdź tylko książki dla dzieci
    public List<Book> bookForKids() {
        return books.stream()
                .filter(Book::isForKids)
                .collect(Collectors.toList());
    }

    // 2. znajdź książki, których autor zaczyna się na literę "J"
    public List<Book> theAuthorIsJ() {
        return books.stream().filter(book -> book.getAuthor()
                .startsWith("J"))
                .collect(Collectors.toList());
    }

    // 3. znajdź tytuły książek, które zawiera frazę "ci"
    public List<Book> titleforCi() {
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
    public List<Book> theLongestBook() {

        return books.stream()
                .sorted(Comparator
                        .comparingInt(Book::getPages))
                .limit(3)
                .collect(Collectors.toList());
    }

    // 6. znajdź tytuły 3 książek, które mają największą liczbę stron
    public List<String> titlesOfThreeLongestBooks() {
        return books.stream()
                .sorted(Comparator.comparingInt(Book::getPages).reversed())
                .map(Book::getTitle).limit(3)
                .collect(Collectors.toList());
    }

    // 7. znajdź książkę o najdłuższym tytule
    public String bookWithLongestTitle() {
        String bookWithLongestTitle= String.valueOf(String.valueOf(books.stream().map(Book::getTitle)).length());
        return bookWithLongestTitle;
    }



// 8. wypisz książki (tytuły  i liczbę stron) posortowane wg rosnącej liczby stron
    public List<Book> booksSortedByPagesAsc() {
        return books.stream()
                .sorted(Comparator
                        .comparingInt(Book::getPages))
                .collect(Collectors.toList());
    }
    // 9. podziel książki wg gatunku
//  public   Map<Category, List<Book>> booksByCategory(){
//      Collectors.groupingByConcurrent(o -> booksByCategory().computeIfAbsent(Category.FANTASTYKA_SCIENCE_FICTION)).toString()
//        return booksByCategory();



    }
