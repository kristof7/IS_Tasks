package com.isa.bookcase.servlet;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.service.BookService;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/find-book")
public class FindBook extends HttpServlet {

    @Inject
    private BookService bookService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter pw = resp.getWriter();
        String authorParam = req.getParameter("author");
        String titleParam = req.getParameter("title");

        Book book;

        if (titleParam == null || titleParam.isEmpty()) {
            book = bookService.findByAuthor(authorParam);
        } else if (authorParam == null || authorParam.isEmpty()) {
            book = bookService.findByTitle(titleParam);
        } else if (authorParam == null || authorParam.isEmpty() && titleParam == null || titleParam.isEmpty()) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        } else {
            book = bookService.findByAuthorAndTitle(authorParam, titleParam);
        }

        pw.println("<!DOCTYPE html>");
        pw.println("<html>");
        pw.println("<body>");

        if (book != null) {

            pw.println("Wynik wyszukiwania:" + "<br>");
            pw.println("<br>");
            pw.println("Autor: " + book.getAuthor() + "<br>");
            pw.println("Tytul: " + book.getTitle() + "<br>");
            pw.println("Kategoria: " + book.getCategory() + "<br>");
            pw.println("Strony: " + book.getPages() + "<br>");
            if ((book.isForKids())) {
                pw.println("Dla dzieci: tak" + "<br>");
            } else {
                pw.println("Dla dzieci: nie" + "<br>");
            }

        } else if (titleParam == null || titleParam.isEmpty()) {
            pw.println("Autor '" + authorParam + "' nie zostal znaleziony!");
        } else if (authorParam == null || authorParam.isEmpty()) {
            pw.println("Tytul '" + titleParam + "' nie zostal znaleziony!");
        }

        pw.println("</body>");
        pw.println("</html>");

    }
}
