package com.isa.bookcase.services;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.repository.BooksRepository;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@RequestScoped
public class BookService {

    @Inject
    private BooksRepository booksRepository;

    public List<Book> getBooksRepository() {
        return booksRepository.getBooks();
    }

    public List<Book> findByAuthor(String authorSearchPhrase) {

        List<Book> filteredBooks = new ArrayList<>();
        List<Book> books = booksRepository.getBooks();

        for ( Book book : books ) {
            boolean bookAlreadyAdded = filteredBooks.contains(book);
            String bookAuthor = book.getAuthor().toLowerCase();
            if ( bookAuthor.startsWith(authorSearchPhrase.toLowerCase()) &&
                    !bookAlreadyAdded) {
                filteredBooks.add(book);
            } else {
                String[] authorSplit = book.getAuthor().split(" ");
                for ( String authorPart : authorSplit ) {
                    if ( authorPart.toLowerCase().startsWith(authorSearchPhrase.toLowerCase()) &&
                            !bookAlreadyAdded) {
                        filteredBooks.add(book);
                    }
                }
            }
        }
        return filteredBooks;
    }

    public List<Book> findByAuthorAndTitle(String authorSearchPhrase, String titleSearchPhrase) {

        List<Book> filteredBooks = new ArrayList<>();
        List<Book> books = booksRepository.getBooks();

        for ( Book book : books ) {
            boolean bookAlreadyAdded = filteredBooks.contains(book);
            String bookAuthor = book.getAuthor().toLowerCase();
            String bookTitle = book.getTitle().toLowerCase();
            if ( bookAuthor.startsWith(authorSearchPhrase.toLowerCase()) &&
                    bookTitle.startsWith(titleSearchPhrase.toLowerCase()) &&
                    !bookAlreadyAdded) {
                filteredBooks.add(book);
            } else {
                String[] authorSplit = book.getAuthor().split(" ");
                String[] titleSplit = book.getTitle().split(" ");
                for ( String authorPart : authorSplit ) {
                    if ( authorPart.toLowerCase().startsWith(authorSearchPhrase.toLowerCase()) ) {
                        for (String titlePart : titleSplit) {
                            if ( titlePart.toLowerCase().startsWith(titleSearchPhrase.toLowerCase()) &&
                                    !bookAlreadyAdded) {
                                filteredBooks.add(book);
                            }
                        }
                    }
                }
            }
        }
        return filteredBooks;
    }

    public void printBookDetails(PrintWriter printWriter, Book book) {
        printWriter.println("Author: " + book.getAuthor() + "<br>");
        printWriter.println("Title: " + book.getTitle() + "<br>");
        printWriter.println("Category: " + book.getCategory() + "<br>");
        printWriter.println("Pages: " + book.getPages() + "<br>");
        printWriter.println("ForKids: " + book.isForKids() + "<br>");
        printWriter.println("<br>");
    }
}
