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
        System.out.println("\nKsiążki dla dzieci:" + booksForKids);

        // 2. znajdź książki, których autor zaczyna się na literę "J"
        List<Book> booksAuthorStartsWithChar = bookService.findBooksWithLetterJForAuthor();
        System.out.println("\nKsiążki, których autor zaczyna sie na litere 'J':" + booksAuthorStartsWithChar);

        // 3. znajdź tytuły książek, które zawiera frazę "ci"
        List<String> bookTitlesWithFragment = bookService.finBooksWithFragmentOfText();
        System.out.println("\nTytuły książek zawierające frazę 'ci':" + bookTitlesWithFragment);

        // 4. oblicz ile stron mają wszystkie książki razem
        Integer sum = bookService.sumOfPagesForAllBooks();
        System.out.println("\nWszystkie książki mają razem stron:" + sum);

        // 5. znajdź 3 najkrótsze książki
        List<Book> threeShortestBooks = bookService.findThreeShortestBooks();
        System.out.println("\nTrzy najkrótsze książki (tytuł + liczba stron):" + threeShortestBooks);

        // 6. znajdź tytuły 3 książek, które mają największą liczbę stron
        List<String> titlesOfThreeLongestBooks = bookService.findThreeBooksWithMaxNumberOfPages();
        System.out.println("\nTytuły trzech najdłuższych książek:" + titlesOfThreeLongestBooks);

        // 7. znajdź książkę o najdłuższym tytule
        String bookWithLongestTitle = bookService.fingBookWithTheLongestTitle();
        System.out.println("\nKsiążka o najdłuzszym tytule:" + bookWithLongestTitle);

        // 8. wypisz książki (tytuły  i liczbę stron) posortowane wg rosnącej liczby stron
        List<Book> booksSortedByPagesAsc = bookService.findBooksWithAscendingOrderForNumbOfPages();
        System.out.println("\nTytuły książek posortowane wg rosnącej liczby stron:" + booksSortedByPagesAsc);

        // 9. podziel książki wg gatunku
        Map<Category, List<Book>> booksByCategory = bookService.orderByCategory();
        System.out.println("\nKsiążki wg gatunków:" + booksByCategory);

        // 10. znajdź najdłuższą książkę w każdym gatunku
        Map<Category, Optional<Book>> longestBookInEachCategory = bookService.findTheLongestBookInEachCategory();
        System.out.println("\nNajdłuższa książka w każdym gatunku:" + longestBookInEachCategory);
    }
}
