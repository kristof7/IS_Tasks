package com.isa.bookcase;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.domain.Category;
import com.isa.bookcase.service.BookService;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class BookSearchApp {

    public static void main(String[] args) {

        BookService bookService = new BookService();

        //  1. znajdź tylko książki dla dzieci
        List<Book> booksForKids;
        System.out.println("\nKsiążki dla dzieci:");
        bookService.booksForKids();

        // 2. znajdź książki, których autor zaczyna się na literę "J"
        List<Book> booksAuthorStartsWithChar;
        System.out.println("\nKsiążki, których autor zaczyna sie na litere 'J':");
        bookService.booksAuthorStartsWithChar();

        // 3. znajdź tytuły książek, które zawiera frazę "ci"
        List<String> bookTitlesWithFragment;
        System.out.println("\nTytuły książek zawierające frazę 'ci':");
        bookService.bookTitlesWithFragment();

        // 4. oblicz ile stron mają wszystkie książki razem
        Integer sumOfPages;
        System.out.println("\nWszystkie książki mają razem stron:");
        bookService.sumOfPages();

        // 5. znajdź 3 najkrótsze książki
        List<Book> threeShortestBooks;
        System.out.println("\nTrzy najkrótsze książki (tytuł + liczba stron):");
        bookService.threeShortestBooks();


        // 6. znajdź tytuły 3 książek, które mają największą liczbę stron
        List<String> titlesOfThreeLongestBooks;
        System.out.println("\nTytuły trzech najdłuższych książek:");
        bookService.titlesOfThreeLongestBooks();

        // 7. znajdź książkę o najdłuższym tytule
        String bookWithLongestTitle;
        System.out.println("\nKsiążka o najdłuzszym tytule:");
        bookService.bookWithLongestTitle();

        // 8. wypisz książki (tytuły  i liczbę stron) posortowane wg rosnącej liczby stron
        List<Book> booksSortedByPagesAsc;
        System.out.println("\nTytuły książek posortowane wg rosnącej liczby stron:");
        bookService.booksSortedByPagesAsc();

        // 9. podziel książki wg gatunku
        Map<Category, List<Book>> booksByCategory;
        System.out.println("\nKsiążki wg gatunków:");
        bookService.booksByCategory();

        // 10. znajdź najdłuższą książkę w każdym gatunku
        Map<Category, Optional<Book>> longestBookInEachCategory;
        System.out.println("\nNajdłuższa książka w każdym gatunku:");
        bookService.longestBookInEachCategory();
    }
}
