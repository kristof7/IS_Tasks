package com.isa.bookcase.servlet;

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
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter pw = resp.getWriter();
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        pw.println("<!DOCTYPE html>");
        pw.println("<html>");
        pw.println("<body>");

        Books books = new Books();
        int length = new Books().getBooks().size();
        for (int i = 0; i < length ; i++) {
            pw.println("<br>"+(i+1)+"." + "<br>");
            pw.println("Author: " + books.getBooks().get(i).getAuthor() + "<br>");
            pw.println("Title: " + books.getBooks().get(i).getTitle() + "<br>");
            pw.println("Category: " + books.getBooks().get(i).getCategory() + "<br>");
            pw.println("Pages: " + books.getBooks().get(i).getPages() + "<br>");
            pw.println("For kids: " + books.getBooks().get(i).isForKids() + "<br>");
        }
        pw.println("</body>");
        pw.println("</html>");

    }
}
