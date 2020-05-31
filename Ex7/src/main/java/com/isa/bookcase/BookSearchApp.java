package com.isa.bookcase;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.domain.Category;
import com.isa.bookcase.service.BookService;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.lang.System.*;

public class BookSearchApp {

    public static void main(String[] args) {

        BookService bookService = new BookService();

        //  1. znajdź tylko książki dla dzieci
        List<Book> booksForKids;
        out.println("\nKsiążki dla dzieci:");
        booksForKids = bookService.findBooksForKids();
        booksForKids.forEach(out::println);

        // 2. znajdź książki, których autor zaczyna się na literę "J"
        List<Book> booksAuthorStartsWithChar;
        out.println("\nKsiążki, których autor zaczyna sie na litere 'J':");
        booksAuthorStartsWithChar = bookService.booksAuthorStartsWithChar("J");
        booksAuthorStartsWithChar.forEach(out::println);

        // 3. znajdź tytuły książek, które zawiera frazę "ci"
        List<String> bookTitlesWithFragment;
        out.println("\nTytuły książek zawierające frazę 'ci':");
        bookTitlesWithFragment = bookService.bookTitlesWithFragment("ci");
        bookTitlesWithFragment.forEach(out::println);

        // 4. oblicz ile stron mają wszystkie książki razem
        Integer sumOfPages;
        out.println("\nWszystkie książki mają razem stron:");
        sumOfPages = bookService.sumOfPages();
        out.println(sumOfPages);

        // 5. znajdź 3 najkrótsze książki
        List<Book> threeShortestBooks;
        out.println("\nTrzy najkrótsze książki (tytuł + liczba stron):");
        threeShortestBooks = bookService.findThreeShortestBooks();
        threeShortestBooks.forEach(book -> out.println(book.getTitle() + " " + book.getPages()));


        // 6. znajdź tytuły 3 książek, które mają największą liczbę stron
        List<String> titlesOfThreeLongestBooks;
        out.println("\nTytuły trzech najdłuższych książek:");
        titlesOfThreeLongestBooks = bookService.findTitlesOfThreeLongestBooks();
        titlesOfThreeLongestBooks.forEach(out::println);

        // 7. znajdź książkę o najdłuższym tytule
        String bookWithLongestTitle;
        out.println("\nKsiążka o najdłuzszym tytule:");
        bookWithLongestTitle = bookService.findbookWithLongestTitle();
        out.println(bookWithLongestTitle);


        // 8. wypisz książki (tytuły  i liczbę stron) posortowane wg rosnącej liczby stron
        List<Book> booksSortedByPagesAsc;
        out.println("\nTytuły książek posortowane wg rosnącej liczby stron:");
        booksSortedByPagesAsc = bookService.sortBooksByPages();
        booksSortedByPagesAsc.forEach(book -> out.println(book.getTitle() + " Liczba stron: " + book.getPages()));


        // 9. podziel książki wg gatunku
        Map<Category, List<Book>> booksByCategory;
        out.println("\nKsiążki wg gatunków:");
        booksByCategory = bookService.sortBooksByCategory();
        booksByCategory.entrySet().forEach(out::println);



        // 10. znajdź najdłuższą książkę w każdym gatunku
        Map<Category, Optional<Book>> longestBookInEachCategory;
        out.println("\nNajdłuższa książka w każdym gatunku:");
        longestBookInEachCategory = bookService.longestBookInEachCategory();
        longestBookInEachCategory.forEach((category, book) ->
        {out.println("Gatunek " + category);
        book.ifPresent(out::println);});

    }
}
