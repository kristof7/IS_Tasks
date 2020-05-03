package com.isa.bookcase.servlet;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.service.Library;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/books")
public class Bookcase extends HttpServlet {
    @Inject
    private Library library;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter printWriter = resp.getWriter();

        printWriter.println("<!DOCTYPE html>");
        printWriter.println("<html>");
        printWriter.println("<body>");
        printWriter.println("<h1>Lista książek</h1>");
        printWriter.println("<ul>");

        for (Book book:library.displayAllBooks()) {
            printWriter.println("<li>");
            printWriter.println(book.toString() + " /" + book.getCategory() + "/ ");
            if(book.isForKids()) printWriter.print("<span style=color:green>FOR KIDS!</span>");
            printWriter.println("</li>");
        }

        printWriter.println("</ul>");
        printWriter.println("</body>");
        printWriter.println("</html>");
    }
}
