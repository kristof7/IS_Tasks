package com.isa.bookcase.servlets;

import com.isa.bookcase.service.BookService;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/books")
public class Bookcase extends HttpServlet {
    @Inject
    BookService bookService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter printWriter = resp.getWriter();
        resp.setContentType("text/html;charset=UTF-8");
        printWriter.println("<!Doctype html>");
        printWriter.println("<body>");
        printWriter.println(bookService.findAll());
        printWriter.println("</body>");
        printWriter.println("</html>");
    }
}
