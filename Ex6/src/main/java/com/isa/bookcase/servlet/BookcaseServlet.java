package com.isa.bookcase.servlet;


import com.isa.bookcase.repository.Books;
import com.isa.bookcase.repository.BooksRepository;
import com.isa.bookcase.service.BookService;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/books")
public class BookcaseServlet extends HttpServlet {

    @Inject
    private BookService bookService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();

        resp.setContentType("text/html;charset=UTF-8");
        writer.println("<!DOCTYPE html>");
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<b>Wszystkie książki : </b>");
        writer.println(bookService.showAllBooks());
        writer.println("</body>");
        writer.println("</html>");

    }
}
