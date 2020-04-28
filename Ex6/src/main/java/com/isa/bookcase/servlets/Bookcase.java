package com.isa.bookcase.servlets;

import com.isa.bookcase.service.BookService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/books")
public class Bookcase extends HttpServlet {
@Inject
    BookService bookService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
resp.getWriter().println(bookService.findAll());
    }
}
