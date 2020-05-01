package com.isa.bookcase.servlet;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.repository.Books;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/books")
public class Bookcase extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter writer = resp.getWriter();

        writer.println("<!DOCTYPE html>");

        Books books = new Books();

        writer.println("<!DOCTYPE html>");
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h1>Lista książek</h1>");
        writer.println("<ul>");

        for (Book book:books.getBooks()) {
            writer.println("<li>");
            writer.println(book.toString());
            //book.toString();
            writer.println("</li>");
        }

        writer.println("</ul>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
