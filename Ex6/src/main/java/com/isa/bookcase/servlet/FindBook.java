package com.isa.bookcase.servlet;


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
        String authorParam = req.getParameter("author");
        String titleParam = req.getParameter("title");

        PrintWriter printWriter = resp.getWriter();

        if (authorParam == null || authorParam.isEmpty()){
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        } else {printWriter.println(bookService.findByAuthor(authorParam));

        }

        if (titleParam == null || titleParam.isEmpty()){
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        } else {printWriter.println(bookService.findByTitle(titleParam));

        }

    }

}
