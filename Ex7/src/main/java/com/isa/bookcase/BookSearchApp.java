package com.isa.bookcase;

import com.isa.bookcase.service.BookService;

public class BookSearchApp {

    public static void main(String[] args) {

        BookService bookService = new BookService();

        System.out.println("Ksiazki dla dzieci"+bookService.booksForKids());
        System.out.println();
        System.out.println("Ksiazki ,których autor zaczyna sie na litere J"+bookService.booksAuthorStartsWithChar());
        System.out.println();
        System.out.println("Książki ,które zawierają fraze ci"+bookService.booksTitleWithFragment());
        System.out.println();
        System.out.println("Wszystkie ksiazki maja razem stron"+bookService.sumOfPages());
        System.out.println();
        System.out.println("Trzy najkrótsze ksiazki"+bookService.threeShortestBooks());
        System.out.println();
        System.out.println("Tytuly trzech najdluzszych ksiazek"+bookService.titlesOfThreeLongestBooks());
        System.out.println();
        System.out.println("Ksiazka o naj dluzszym tytule"+bookService.bookWithLongestTitle());
        System.out.println();
        System.out.println("Tytuly książek posortowane wedlug ilosci stron"+bookService.booksSortedByPagesAsc());
        System.out.println();
        System.out.println("Ksiazki wedlug gatunkow" +bookService.booksByCategory());
        System.out.println();
        System.out.println("nNajdłuższa książka w każdym gatunku:"+bookService.longestBookInEachCategory());
    }}