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
        List<Book> booksForKids = bookService.findBooksForKids();
        System.out.println("\nKsiążki dla dzieci:");
        booksForKids.forEach(System.out::println);

        // 2. znajdź książki, których autor zaczyna się na literę "J"
        List<Book> booksAuthorStartsWithChar = bookService.findBooksAuthorStartsWithChar();
        System.out.println("\nKsiążki, których autor zaczyna sie na litere 'J':");
        booksAuthorStartsWithChar.forEach(System.out::println);

        // 3. znajdź tytuły książek, które zawiera frazę "ci"
        List<String> bookTitlesWithFragment = bookService.findBookTitlesWithFragment();
        System.out.println("\nTytuły książek zawierające frazę 'ci':");
        bookTitlesWithFragment.forEach(System.out::println);

        // 4. oblicz ile stron mają wszystkie książki razem
        Integer sumOfPages = bookService.findSumOfPages();
        System.out.println("\nWszystkie książki mają razem stron:");
        System.out.println(sumOfPages);

        // 5. znajdź 3 najkrótsze książki
        List<Book> threeShortestBooks = bookService.findThreeShortestBooks();
        System.out.println("\nTrzy najkrótsze książki (tytuł + liczba stron):");
        threeShortestBooks.forEach(System.out::println);


        // 6. znajdź tytuły 3 książek, które mają największą liczbę stron
        List<String> titlesOfThreeLongestBooks = bookService.findTitlesOfThreeLongestBooks();
        System.out.println("\nTytuły trzech najdłuższych książek:");
        titlesOfThreeLongestBooks.forEach(System.out::println);

        // 7. znajdź książkę o najdłuższym tytule
        String bookWithLongestTitle = bookService.findBookWithLongestTitle();
        System.out.println("\nKsiążka o najdłuzszym tytule:");
        System.out.println(bookWithLongestTitle);

        // 8. wypisz książki (tytuły  i liczbę stron) posortowane wg rosnącej liczby stron
        List<Book> booksSortedByPagesAsc = bookService.findBooksSortedByPagesAsc();
        System.out.println("\nTytuły książek posortowane wg rosnącej liczby stron:");
        booksSortedByPagesAsc.forEach(System.out::println);

        // 9. podziel książki wg gatunku
        Map<Category, List<Book>> booksByCategory = bookService.findBooksByCategory();
        System.out.println("\nKsiążki wg gatunków:");
        booksByCategory.forEach((category, books) -> System.out.println(category + " = " + books));

        // 10. znajdź najdłuższą książkę w każdym gatunku
        Map<Category, Optional<Book>> longestBookInEachCategory = bookService.findLongestBookInEachCategory();
        System.out.println("\nNajdłuższa książka w każdym gatunku:");
        longestBookInEachCategory.forEach((category, book) -> System.out.println(category + " = "
                + book.get()));
    }
}
