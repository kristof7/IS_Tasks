package com.isa.bookcase.servlet;

import com.isa.bookcase.service.BookService;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/find-book")
public class FindBook extends HttpServlet {

    @Inject
    private BookService bookService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.println("<!DOCTYPE html><html><body>");

        String authorParam = req.getParameter("author");
        String titleParam = null;

        if (authorParam == null || authorParam.isEmpty()){
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }else {
            Enumeration en = req.getParameterNames();

            while (en.hasMoreElements()) {
                Object obj = en.nextElement();
                String parm = (String) obj;

                if (parm.equals("title")) {
                    titleParam = req.getParameter("title");
                }
            }

            if(titleParam == null || titleParam.isEmpty()){
                writer.println(bookService.findByAuthor(authorParam));
            }else {
                writer.println(bookService.findByAuthorAndTitle(authorParam, titleParam));
            }
            writer.println("</body></html>");
        }
    }
}

