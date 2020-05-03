package com.isa.bookcase.servlet;

import com.isa.bookcase.cdi.RandomBookCDIRequestBean;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/book-for-today")
public class RandomBook extends HttpServlet {

    @Inject
    private RandomBookCDIRequestBean requestBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter printWriter = resp.getWriter();

        printWriter.println("<!DOCTYPE html>");
        printWriter.println("<html>");
        printWriter.println("<body>");
        printWriter.println("<h1>Książka na dziś</h1>");

        printWriter.println(requestBean.getRandomBook().toString());

        printWriter.println("</body>");
        printWriter.println("</html>");
    }
}
