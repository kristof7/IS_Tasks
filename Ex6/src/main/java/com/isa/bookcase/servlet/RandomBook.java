package com.isa.bookcase.servlet;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.service.RandomBookService;
import htmlHelpers.HtmlPreparer;

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
    RandomBookService service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        HtmlPreparer.tableHeaderRaw(out,"category","author","title","pages");
        Book book = service.RandomBook();
        HtmlPreparer.tableOtherRaw(out, book.getCategory().toString(), book.getAuthor(), book.getTitle(), String.valueOf(book.getPages()));
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
        req.getRequestDispatcher("back-to-main-or-random-link.jsp").include(req,resp);
    }
}
