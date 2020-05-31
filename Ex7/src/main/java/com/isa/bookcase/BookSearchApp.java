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

        List<Book> booksForKids = bookService.getBooksForKids();
        System.out.println("\nKsiążki dla dzieci:");
        booksForKids.forEach(book -> System.out.println(book.getTitle()));

        // 2. znajdź książki, których autor zaczyna się na literę "J"

        List<Book> booksAuthorStartsWithChar = bookService.getBooksForAuthorStartingWithJ();
        System.out.println("\nKsiążki, których autor zaczyna sie na litere 'J':");
        booksAuthorStartsWithChar.forEach(book -> System.out.println(book.getTitle()));

        // 3. znajdź tytuły książek, które zawiera frazę "ci"

        List<String> bookTitlesWithFragment = bookService.getBooksForTitleContainingCi();
        System.out.println("\nTytuły książek zawierające frazę 'ci':");
        bookTitlesWithFragment.forEach(System.out::println);

        // 4. oblicz ile stron mają wszystkie książki razem

        Integer sumOfPages = bookService.sumForPagesOfAllBooks();
        System.out.println("\nWszystkie książki mają razem stron:");
        System.out.println(sumOfPages);

        // 5. znajdź 3 najkrótsze książki

        List<Book> threeShortestBooks = bookService.getThreeShortestBooksWithPages();
        System.out.println("\nTrzy najkrótsze książki (tytuł + liczba stron):");
        threeShortestBooks.forEach(book -> System.out.println(book.getTitle() + " - " + book.getPages() + " str."));

        // 6. znajdź tytuły 3 książek, które mają największą liczbę stron

        List<String> titlesOfThreeLongestBooks = bookService.getThreeLongestBooks();
        System.out.println("\nTytuły trzech najdłuższych książek:");
        titlesOfThreeLongestBooks.forEach(System.out::println);

        // 7. znajdź książkę o najdłuższym tytule

        String bookWithLongestTitle = bookService.getBookWithLongestTitle();
        System.out.println("\nKsiążka o najdłuzszym tytule:");
        System.out.println(bookWithLongestTitle);

        // 8. wypisz książki (tytuły  i liczbę stron) posortowane wg rosnącej liczby stron

        List<Book> booksSortedByPagesAsc = bookService.getBooksSortedByPagesAsc();
        System.out.println("\nTytuły książek posortowane wg rosnącej liczby stron:");
        booksSortedByPagesAsc.forEach(book -> System.out.println(book.getTitle() + " - " + book.getPages() + " str."));

        // 9. podziel książki wg gatunku

        Map<Category, List<Book>> booksByCategory = bookService.getBooksSortedByCategory();
        System.out.println("\nKsiążki wg gatunków:");
        booksByCategory.forEach((category, book) -> System.out.println(category + " = " + book));

        // 10. znajdź najdłuższą książkę w każdym gatunku

        Map<Category, Optional<Book>> longestBookInEachCategory = bookService.getLongestBookInEachCategory();
        System.out.println("\nNajdłuższa książka w każdym gatunku:");
        longestBookInEachCategory.forEach((category, book) -> System.out.println(category + " = " + book.get()));
    }
}
