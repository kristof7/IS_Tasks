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
        List<Book> booksForKids=bookService.bookForKids();
        // TODO dodaj odpowiednią metodę w klasie BookService
        System.out.println("\nKsiążki dla dzieci:");
        booksForKids.forEach(book -> System.out.println(book.toString()));
        // TODO wypisz wyniki na konsolę

        // 2. znajdź książki, których autor zaczyna się na literę "J"
        List<Book> booksAuthorStartsWithChar=bookService.theAuthorIsJ(); // TODO dodaj odpowiednią metodę w klasie BookService
        System.out.println("\nKsiążki, których autor zaczyna sie na litere 'J':");
        booksAuthorStartsWithChar.forEach(book -> System.out.println(book.toString()));
        // TODO wypisz wyniki na konsolę

        // 3. znajdź tytuły książek, które zawiera frazę "ci"
        List<Book> bookTitlesWithFragment=bookService.titleforCi();// TODO dodaj odpowiednią metodę w klasie BookService
        System.out.println("\nTytuły książek zawierające frazę 'ci':");
        bookTitlesWithFragment.forEach(book -> System.out.println(book.toString()));
        // TODO wypisz wyniki na konsolę

        // 4. oblicz ile stron mają wszystkie książki razem
        Integer sumOfPages=bookService.sumPagesBook();
        // TODO dodaj odpowiednią metodę w klasie BookService
        System.out.println("\nWszystkie książki mają razem stron:"+sumOfPages);
        // TODO wypisz wynik na konsolę

        // 5. znajdź 3 najkrótsze książki
        List<Book> threeShortestBooks=bookService.theLongestBook(); // TODO dodaj odpowiednią metodę w klasie BookService
        System.out.println("\nTrzy najkrótsze książki (tytuł + liczba stron):");
        threeShortestBooks.forEach(book -> System.out.println(book.getAuthor()+ " "+ book.getPages()));
        // TODO wypisz wyniki na konsolę

        // 6. znajdź tytuły 3 książek, które mają największą liczbę stron
        List<Book> titlesOfThreeLongestBooks=bookService.titlesOfLongestBooks(); // TODO dodaj odpowiednią metodę w klasie BookService
        System.out.println("\nTytuły trzech najdłuższych książek:");
       titlesOfThreeLongestBooks.forEach(book -> System.out.println(book.getAuthor()+" "+ book.getPages()));
        // TODO wypisz wyniki na konsolę

        // 7. znajdź książkę o najdłuższym tytule
        String bookWithLongestTitle=bookService.bookWithLongestTitle(); // TODO dodaj odpowiednią metodę w klasie BookService
       System.out.println("\nKsiążka o najdłuzszym tytule:");
        System.out.println(bookWithLongestTitle);
       // TODO wypisz wynik na konsolę

        // 8. wypisz książki (tytuły  i liczbę stron) posortowane wg rosnącej liczby stron
        List<Book> booksSortedByPagesAsc=bookService.booksSortedByPagesAsc();
        // TODO dodaj odpowiednią metodę w klasie BookService
        System.out.println("\nTytuły książek posortowane wg rosnącej liczby stron:");
        booksSortedByPagesAsc.forEach(book -> System.out.println(book.getTitle() + " " + book.getPages()));
        // TODO wypisz wyniki na konsolę

        // 9. podziel książki wg gatunku
        Map<Category, List<Book>> booksByCategory =bookService.booksByCategory(); // TODO dodaj odpowiednią metodę w klasie BookService
       System.out.println("\nKsiążki wg gatunków:");
        System.out.println(booksByCategory.toString());
      // TODO wypisz wyniki na konsolę

        // 10. znajdź najdłuższą książkę w każdym gatunku
        Map<Category, Optional<Book>> longestBookInEachCategory; // TODO dodaj odpowiednią metodę w klasie BookService
        System.out.println("\nNajdłuższa książka w każdym gatunku:");
        // TODO wypisz wyniki na konsolę
    }
}
