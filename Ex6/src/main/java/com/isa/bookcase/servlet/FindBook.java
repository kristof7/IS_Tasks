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
import java.util.List;

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

        List<Book> book;
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
            for (int i = 0; i < book.size(); i++) {

                pw.println("Wynik wyszukiwania:" + "<br>");
                pw.println("<br>");
                pw.println("Autor: " + book.get(i).getAuthor() + "<br>");
                pw.println("Tytul: " + book.get(i).getTitle() + "<br>");
                pw.println("Kategoria: " + book.get(i).getCategory() + "<br>");
                pw.println("Strony: " + book.get(i).getPages() + "<br>");
                if ((book.get(i).isForKids())) {
                    pw.println("Dla dzieci: tak" + "<br>");
                } else if (!book.get(i).isForKids()) {
                    pw.println("Dla dzieci: nie" + "<br>");
                }
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
