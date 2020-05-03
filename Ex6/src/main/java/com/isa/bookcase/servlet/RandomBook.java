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

@WebServlet("/book-for-today")
public class RandomBook extends HttpServlet {

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
        int random = (int) (Math.random() * length);
        Book randomBook = books.getBooks().get(random);
        pw.println("KSIAZKA DNIA:" + "<br>");
        pw.println("<br>");
        pw.println("Autor: " + randomBook.getAuthor() + "<br>");
        pw.println("Tytul: " + randomBook.getTitle() + "<br>");
        pw.println("Kategoria: " + randomBook.getCategory() + "<br>");
        pw.println("Strony: " + randomBook.getPages() + "<br>");
        if ((randomBook.isForKids())) {
            pw.println("Dla dzieci: tak");
        } else {
            pw.println("Dla dzieci: nie");
        }


        pw.println("</body>");
        pw.println("</html>");
    }
}
