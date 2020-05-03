package com.isa.bookcase.servlet;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.repository.BooksRepository;
import com.isa.bookcase.service.BookService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/find-book")
public class FindBookServlet extends HttpServlet {

    @Inject
    private BookService bookService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();

        String authorParam = req.getParameter("author");
        String titleParam = req.getParameter("title");

        if (authorParam == null || authorParam.isEmpty()) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }

        if (titleParam == null || titleParam.isEmpty()) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }

        Book bookByAutor = bookService.findByAuthor(authorParam);
        Book bookByTitle = bookService.findByAuthor(authorParam);

        writer.println("<!DOCTYPE html>");
        writer.println("<html>");
        writer.println("<body>");

        if (bookByAutor != null) {
            writer.println("Autor :" + bookByAutor.getAuthor() + "<br>");
            writer.println("Tytuł :" + bookByAutor.getTitle() + "<br>");
        } else {
            writer.println("Autor nie został znaleziony.");
        }

        if (bookByTitle != null) {
            writer.println("Autor :" + bookByTitle.getAuthor() + "<br>");
            writer.println("Tytuł :" + bookByTitle.getTitle() + "<br>");
        } else {
            writer.println("Tytuł nie został znaleziony.");
        }

        writer.println("</body>");
        writer.println("</html>");
    }

}
