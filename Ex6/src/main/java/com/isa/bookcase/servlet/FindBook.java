package com.isa.bookcase.servlet;

import com.isa.bookcase.cdi.FindBookCDIRequestBean;
import com.isa.bookcase.cdi.RandomBookCDIRequestBean;
import com.isa.bookcase.domain.Book;
import com.isa.bookcase.service.Library;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Optional;

@WebServlet("/find-book")
public class FindBook extends HttpServlet {

    @Inject
    private Library library;

    @Inject
    private FindBookCDIRequestBean requestBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter printWriter = resp.getWriter();

        //Optional<String> authorParam = Optional.ofNullable(req.getParameter("author")).orElse("NULL");

        //(localhost))/Ex6/find-book?author=example&title=example
        String authorParam = req.getParameter("author");
        String titleParam = req.getParameter("title");

        if ((authorParam == null || authorParam.isEmpty()) && (titleParam == null || titleParam.isEmpty())) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }

        //Book book = library.displayByAuthor(authorParam).orElse(null);
       // List<Book> booksByAuthor = requestBean.displayByAuthor(authorParam).;

        printWriter.println("<!DOCTYPE html>");
        printWriter.println("<html>");
        printWriter.println("<body>");
        printWriter.println("<h1>Książki wyszukane po zadanym autorze</h1>");

        if (requestBean.displayByAuthor(authorParam) != null || !requestBean.displayByAuthor(authorParam).isEmpty()) {
            for (Book book : requestBean.displayByAuthor(authorParam)) {
                printWriter.println("<li>");
                printWriter.println(book.toString() + " /" + book.getCategory() + "/ ");
                if (book.isForKids()) printWriter.print("<span style=color:green>FOR KIDS!</span>");
                printWriter.println("</li>");
            }
        } else{
            printWriter.println("Nie znaleziono po autorze");
        }

        printWriter.println("<h1>Książki wyszukane po zadanym tytule</h1>");

        if (requestBean.displayByTitle(titleParam) != null || !requestBean.displayByTitle(titleParam).isEmpty()) {
            for (Book book : requestBean.displayByTitle(titleParam)) {
                printWriter.println("<li>");
                printWriter.println(book.toString() + " /" + book.getCategory() + "/ ");
                if (book.isForKids()) printWriter.print("<span style=color:green>FOR KIDS!</span>");
                printWriter.println("</li>");
            }
        } else {
            printWriter.println("Nie znaleziono po tytule");
        }

        printWriter.println("</body>");
        printWriter.println("</html>");
    }
}
