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
import java.util.List;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.service.BookService;
@WebServlet("/books")
class BookCase extends HttpServlet {

    @Inject
    private BookService bookService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = resp.getWriter();
        writer.println("<!DOCTYPE html><html><body>");

        List<Book> books = bookService.findAll();
        for (Book book: books) {

            writer.println("Autor: " + book.getAuthor() + "<br>");
            writer.println("Tytul: " + book.getTitle() + "<br>");
            writer.println("Strony: " + book.getPages() + "<br>" );
            writer.println("Kategoria: " + book.getCategory() + "<br>");
            writer.println("Dla dzieci: " + book.isForKids() + "<br><br>");

        }

        writer.println("</body></html>");
    }
}


