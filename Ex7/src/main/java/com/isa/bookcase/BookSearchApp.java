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
        List<Book> booksForKids; // TODO dodaj odpowiednią metodę w klasie BookService
        System.out.println("\nKsiążki dla dzieci:");
        // TODO wypisz wyniki na konsolę

        // 2. znajdź książki, których autor zaczyna się na literę "J"
        List<Book> booksAuthorStartsWithChar; // TODO dodaj odpowiednią metodę w klasie BookService
        System.out.println("\nKsiążki, których autor zaczyna sie na litere 'J':");
        // TODO wypisz wyniki na konsolę

        // 3. znajdź tytuły książek, które zawiera frazę "ci"
        List<String> bookTitlesWithFragment; // TODO dodaj odpowiednią metodę w klasie BookService
        System.out.println("\nTytuły książek zawierające frazę 'ci':");
        // TODO wypisz wyniki na konsolę

        // 4. oblicz ile stron mają wszystkie książki razem
        Integer sumOfPages; // TODO dodaj odpowiednią metodę w klasie BookService
        System.out.println("\nWszystkie książki mają razem stron:");
        // TODO wypisz wynik na konsolę

        // 5. znajdź 3 najkrótsze książki
        List<Book> threeShortestBooks; // TODO dodaj odpowiednią metodę w klasie BookService
        System.out.println("\nTrzy najkrótsze książki (tytuł + liczba stron):");
        // TODO wypisz wyniki na konsolę

        // 6. znajdź tytuły 3 książek, które mają największą liczbę stron
        List<String> titlesOfThreeLongestBooks; // TODO dodaj odpowiednią metodę w klasie BookService
        System.out.println("\nTytuły trzech najdłuższych książek:");
        // TODO wypisz wyniki na konsolę

        // 7. znajdź książkę o najdłuższym tytule
        String bookWithLongestTitle; // TODO dodaj odpowiednią metodę w klasie BookService
        System.out.println("\nKsiążka o najdłuzszym tytule:");
        // TODO wypisz wynik na konsolę

        // 8. wypisz książki (tytuły  i liczbę stron) posortowane wg rosnącej liczby stron
        List<Book> booksSortedByPagesAsc; // TODO dodaj odpowiednią metodę w klasie BookService
        System.out.println("\nTytuły książek posortowane wg rosnącej liczby stron:");
        // TODO wypisz wyniki na konsolę

        // 9. podziel książki wg gatunku
        Map<Category, List<Book>> booksByCategory; // TODO dodaj odpowiednią metodę w klasie BookService
        System.out.println("\nKsiążki wg gatunków:");
        // TODO wypisz wyniki na konsolę

        // 10. znajdź najdłuższą książkę w każdym gatunku
        Map<Category, Optional<Book>> longestBookInEachCategory; // TODO dodaj odpowiednią metodę w klasie BookService
        System.out.println("\nNajdłuższa książka w każdym gatunku:");
        // TODO wypisz wyniki na konsolę
    }
}
