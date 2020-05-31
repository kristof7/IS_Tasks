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
        System.out.println("\n1. Książki dla dzieci:\n" + booksForKids);

        // 2. znajdź książki, których autor zaczyna się na literę "J"
        List<Book> booksAuthorStartsWithChar = bookService.booksAuthorStartsWithChar();
        System.out.println("\n2. Książki, których autor zaczyna sie na litere 'J':\n" + booksAuthorStartsWithChar);

        // 3. znajdź tytuły książek, które zawiera frazę "ci"
        List<String> bookTitlesWithFragment = bookService.bookTitlesWithFragment();
        System.out.println("\n3. Tytuły książek zawierające frazę 'ci':\n" + bookTitlesWithFragment);

        // 4. oblicz ile stron mają wszystkie książki razem
        Integer sumOfPages = bookService.sumOfPages();
        System.out.println("\n4. Wszystkie książki mają razem stron:\n" + sumOfPages);

        // 5. znajdź 3 najkrótsze książki
        List<Book> threeShortestBooks = bookService.threeShortestBooks();
        System.out.println("\n5. Trzy najkrótsze książki (tytuł + liczba stron):\n" + threeShortestBooks);

        // 6. znajdź tytuły 3 książek, które mają największą liczbę stron
        List<String> titlesOfThreeLongestBooks = bookService.titlesOfThreeLongestBooks();
        System.out.println("\n6. Tytuły trzech najdłuższych książek:\n" + titlesOfThreeLongestBooks);

        // 7. znajdź książkę o najdłuższym tytule
        String bookWithLongestTitle = bookService.bookWithLongestTitle();
        System.out.println("\n7. Książka o najdłuzszym tytule:\n" + bookWithLongestTitle);

        // 8. wypisz książki (tytuły  i liczbę stron) posortowane wg rosnącej liczby stron
        List<Book> booksSortedByPagesAsc = bookService.booksSortedByPagesAsc();
        System.out.println("\n8. Tytuły książek posortowane wg rosnącej liczby stron:\n" + booksSortedByPagesAsc);

        // 9. podziel książki wg gatunku
        Map<Category, List<Book>> booksByCategory = bookService.booksByCategory();
        System.out.println("\n9. Książki wg gatunków:\n" + booksByCategory);

        // 10. znajdź najdłuższą książkę w każdym gatunku
        Map<Category, Optional<Book>> longestBookInEachCategory = bookService.longestBookInEachCategory();
        System.out.println("\n10. Najdłuższa książka w każdym gatunku:\n" + longestBookInEachCategory);
    }
}
