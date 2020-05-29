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
        List<Book> booksForKids = bookService.booksForKids();
        System.out.println("\nKsiążki dla dzieci:");
        booksForKids.forEach(book -> System.out.println(book.toString()));

        // 2. znajdź książki, których autor zaczyna się na literę "J"
        List<Book> booksAuthorStartsWithChar = bookService.bookAuthorStartsWithChar();
        System.out.println("\nKsiążki, których autor zaczyna sie na litere 'J':");
        booksAuthorStartsWithChar.forEach(book -> System.out.println(book.toString()));

        // 3. znajdź tytuły książek, które zawiera frazę "ci"
        List<String> bookTitlesWithFragment = bookService.bookTitlesWithFragment();
        System.out.println("\nTytuły książek zawierające frazę 'ci':");
        bookTitlesWithFragment.forEach(title -> System.out.println(title));

        // 4. oblicz ile stron mają wszystkie książki razem
        Integer sumOfPages = bookService.sumOfPages();
        System.out.println("\nWszystkie książki mają razem stron:");
        System.out.println(sumOfPages);

        // 5. znajdź 3 najkrótsze książki
        List<Book> threeShortestBooks = bookService.threeShortestBooks();
        System.out.println("\nTrzy najkrótsze książki (tytuł + liczba stron):");
        threeShortestBooks.forEach(book -> System.out.println(book.getTitle() + " " + book.getPages()));

        // 6. znajdź tytuły 3 książek, które mają największą liczbę stron
        List<String> titlesOfThreeLongestBooks = bookService.threeLongestBooks();
        System.out.println("\nTytuły trzech najdłuższych książek:");
        titlesOfThreeLongestBooks.forEach(title -> System.out.println(title));

        // 7. znajdź książkę o najdłuższym tytule
        String bookWithLongestTitle = bookService.bookWhitTheLongestTitle();
        System.out.println("\nKsiążka o najdłuzszym tytule:");
        System.out.println(bookWithLongestTitle);

        // 8. wypisz książki (tytuły  i liczbę stron) posortowane wg rosnącej liczby stron
        List<Book> booksSortedByPagesAsc = bookService.booksSortedByPagesAsc();
        System.out.println("\nTytuły książek posortowane wg rosnącej liczby stron:");
        booksSortedByPagesAsc.forEach(book -> System.out.println(book.getTitle()));

        // 9. podziel książki wg gatunku
        Map<Category, List<Book>> booksByCategory = bookService.booksByCategory();
        System.out.println("\nKsiążki wg gatunków:");
        booksByCategory.forEach((key,value) -> System.out.println(key + " - " + value));

        // 10. znajdź najdłuższą książkę w każdym gatunku
        Map<Category, Optional<Book>> longestBookInEachCategory; // TODO dodaj odpowiednią metodę w klasie BookService
        System.out.println("\nNajdłuższa książka w każdym gatunku:");
        // TODO wypisz wyniki na konsolę
    }
}
