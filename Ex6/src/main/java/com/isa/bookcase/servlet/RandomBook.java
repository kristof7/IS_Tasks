package com.isa.bookcase.servlet;

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

@WebServlet("/book-for-today")
public class RandomBook extends HttpServlet {
    @Inject
    private Library library;

    @Inject
    private RandomBookCDIRequestBean requestBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter writer = resp.getWriter();

        writer.println("<!DOCTYPE html>");
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h1>Książka na dziś</h1>");

        writer.println(requestBean.getRandomBook().toString());

        writer.println("</body>");
        writer.println("</html>");
    }
}
