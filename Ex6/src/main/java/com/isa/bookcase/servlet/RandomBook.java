package com.isa.bookcase.servlet;

import com.isa.bookcase.repository.BookRepository;
import com.isa.bookcase.repository.Books;
import com.isa.bookcase.service.BookService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/book-for-today")
public class RandomBook extends HttpServlet {
/*
1. W konteście /book-for-today
powinna się wyświetlić losowa książka z repozytorium.
 */

@Inject
    BookService bookService;

@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    PrintWriter writer = resp.getWriter();
    writer.println(bookService.randomBook());

    }
}
