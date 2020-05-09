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
public class RandomBook extends HttpServlet {

    @Inject
    private BookService bookService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter pw = resp.getWriter();

        pw.println("<!DOCTYPE html>");
        pw.println("<html>");
        pw.println("<body>");

        pw.println("KSIAZKA DNIA:" + "<br>");
        pw.println("<br>" + bookService.randomBook().printBookDetails(bookService.randomBook()) + "<br>");

        pw.println("</body>");
        pw.println("</html>");
    }
}
