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
        System.out.println(booksForKids);

        // 2. znajdź książki, których autor zaczyna się na literę "J"
        List<Book> booksAuthorStartsWithChar = bookService.allBooksStartingWithTheLetter();
        System.out.println("\nKsiążki, których autor zaczyna sie na litere 'J':");
        System.out.println(booksAuthorStartsWithChar);

        // 3. znajdź tytuły książek, które zawiera frazę "ci"
        List<String> bookTitlesWithFragment = bookService.findBookTitleWithStringFragment();
        System.out.println("\nTytuły książek zawierające frazę 'ci':");
        System.out.println(bookTitlesWithFragment);

        // 4. oblicz ile stron mają wszystkie książki razem
        Integer sumOfPages = bookService.sumOfPages();
        System.out.println("\nWszystkie książki mają razem stron:");
        System.out.println(sumOfPages);

        // 5. znajdź 3 najkrótsze książki
        List<Book> threeShortestBooks = bookService.findThreeShortestBooks();
        System.out.println("\nTrzy najkrótsze książki (tytuł + liczba stron):");
        System.out.println(threeShortestBooks);

        // 6. znajdź tytuły 3 książek, które mają największą liczbę stron
        List<String> titlesOfThreeLongestBooks = bookService.findThreeLongestBooks();
        System.out.println("\nTytuły trzech najdłuższych książek:");
        System.out.println(titlesOfThreeLongestBooks);

        // 7. znajdź książkę o najdłuższym tytule
        String bookWithLongestTitle = bookService.findBookWithLongestTitle();
        System.out.println("\nKsiążka o najdłuzszym tytule:");
        System.out.println(bookWithLongestTitle);

        // 8. wypisz książki (tytuły  i liczbę stron) posortowane wg rosnącej liczby stron
        List<Book> booksSortedByPagesAsc = bookService.printAllBooksSortedByPages();
        System.out.println("\nTytuły książek posortowane wg rosnącej liczby stron:");
        System.out.println(booksSortedByPagesAsc);

        // 9. podziel książki wg gatunku
        Map<Category, List<Book>> booksByCategory = bookService.printBooksByCategory();
        System.out.println("\nKsiążki wg gatunków:");
        System.out.println(booksByCategory);

        // 10. znajdź najdłuższą książkę w każdym gatunku
        Map<Category, Optional<Book>> longestBookInEachCategory = bookService.printLongestBookInEachCategory();
        System.out.println("\nNajdłuższa książka w każdym gatunku:");
        System.out.println(longestBookInEachCategory);
    }
}
