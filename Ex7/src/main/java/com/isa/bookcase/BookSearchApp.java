package com.isa.bookcase;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.domain.Category;
import com.isa.bookcase.service.BookService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class BookSearchApp {

    public static void main(String[] args) {

        BookService bookService = new BookService();

        //  1. znajdź tylko książki dla dzieci
        List<Book> booksForKids = new ArrayList<>(); // TODO dodaj odpowiednią metodę w klasie BookService
        System.out.println("\nKsiążki dla dzieci:");
        bookService.isForKidsList(booksForKids).forEach(System.out::println);

        // 2. znajdź książki, których autor zaczyna się na literę "J"
        List<Book> booksAuthorStartsWithChar = new ArrayList<>(); // TODO dodaj odpowiednią metodę w klasie BookService
        System.out.println("\nKsiążki, których autor zaczyna sie na litere 'J':");
        bookService.authorStartsWithJ(booksAuthorStartsWithChar).forEach(System.out::println);

        // 3. znajdź tytuły książek, które zawiera frazę "ci"
        List<String> bookTitlesWithFragment = new ArrayList<>();// TODO dodaj odpowiednią metodę w klasie BookService
        System.out.println("\nTytuły książek zawierające frazę 'ci':");
        bookService.containsCi(bookTitlesWithFragment).forEach(System.out::println);

        // 4. oblicz ile stron mają wszystkie książki razem
        Integer sumOfPages; // TODO dodaj odpowiednią metodę w klasie BookService
        System.out.println("\nWszystkie książki mają razem stron:");
        sumOfPages = bookService.sumOfPages();
        System.out.println(sumOfPages);

        // 5. znajdź 3 najkrótsze książki
        List<Book> threeShortestBooks; // TODO dodaj odpowiednią metodę w klasie BookService
        System.out.println("\nTrzy najkrótsze książki (tytuł + liczba stron):");
        threeShortestBooks = bookService.threeShortestBooks();
        threeShortestBooks.forEach(book -> System.out.println("Title: "+book.getTitle() +" | Pages: "+ book.getPages()));

        // 6. znajdź tytuły 3 książek, które mają największą liczbę stron
        List<String> titlesOfThreeLongestBooks; // TODO dodaj odpowiednią metodę w klasie BookService
        System.out.println("\nTytuły trzech najdłuższych książek:");
        titlesOfThreeLongestBooks = bookService.titlesOfThreeLongestBooks();
        titlesOfThreeLongestBooks.forEach(System.out::println);

        // 7. znajdź książkę o najdłuższym tytule
        String bookWithLongestTitle; // TODO dodaj odpowiednią metodę w klasie BookService
        System.out.println("\nKsiążka o najdłuzszym tytule:");
        bookWithLongestTitle = bookService.bookWithLongestTitle().toString();
        System.out.println(bookWithLongestTitle);

        // 8. wypisz książki (tytuły  i liczbę stron) posortowane wg rosnącej liczby stron
        List<Book> booksSortedByPagesAsc; // TODO dodaj odpowiednią metodę w klasie BookService
        System.out.println("\nTytuły książek posortowane wg rosnącej liczby stron:");
        booksSortedByPagesAsc = bookService.booksSortedByPagesAsc();
        booksSortedByPagesAsc.forEach(book -> System.out.println("Title: "+book.getTitle() +" | Pages: "+ book.getPages()));

        // 9. podziel książki wg gatunku
        Map<Category, List<Book>> booksByCategory; // TODO dodaj odpowiednią metodę w klasie BookService
        System.out.println("\nKsiążki wg gatunków:");
        booksByCategory = bookService.booksByCategory();
        booksByCategory.forEach((category, books) -> System.out.println(category +"\n"+ books));

        // 10. znajdź najdłuższą książkę w każdym gatunku
        Map<Category, Optional<Book>> longestBookInEachCategory; // TODO dodaj odpowiednią metodę w klasie BookService
        System.out.println("\nNajdłuższa książka w każdym gatunku:");
        longestBookInEachCategory = bookService.longestBookInEachCategory();
        longestBookInEachCategory.forEach((category, books) -> System.out.println(category +"\n"+ books));
    }
}
