package com.isa.bookcase.servlet;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.service.BookService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/books")
class Bookcase extends HttpServlet {
    /*
    1. Utwórz servlet Bookcase który w kontekście webowym /books
    wyświetli wszystkie książki z repozytorium na jedynym widoku:
    każda pozycja na liście powinna wyświetlać wszystkie dostępne
    informacje o danej książce.
     */

    @Inject
    private BookService bookService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = resp.getWriter();
        writer.println("<!DOCTYPE html><html><body>");
        int i = 1;

        for (Book book : bookService.findAll()){
            writer.println(i + ". ");
            writer.println("Autor: " + book.getAuthor() + "<br>");
            writer.println("Tytul: " + book.getTitle() + "<br>");
            writer.println("Strony: " + book.getPages() + "<br>" );
            writer.println("Kategoria: " + book.getCategory() + "<br>");
            writer.println("Dla dzieci: " + book.isForKids() + "<br><br>");
            i++;
        }

        writer.println("</body></html>");
    }
}
