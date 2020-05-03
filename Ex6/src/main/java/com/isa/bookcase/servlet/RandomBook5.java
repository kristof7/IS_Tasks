package com.isa.bookcase.servlet;

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
public class RandomBook5 extends HttpServlet {

    @Inject
    private BookService bookService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<table>");
        //out.println("<tr>");
        out.println("<p>Ksiazka na dzisiaj " +(bookService.getRandomBook()) + "</p>");
        //out.println("</tr>");
        out.println("<table>");
        out.println("</body>");
        out.println("</html>");
    }
}




