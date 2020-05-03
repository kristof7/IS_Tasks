package com.isa.bookcase.servlet;
//zaimplementuj wyszukiwanie książki po zadanym w request parametrze author,
//jeśli parametr author nie został podany w request, zwróć status BAD_REQUEST (wykorzystaj klasę HttpServletResponse),
//jeśli jako wartość parametru została podana np. tylko litera "A", powinny się wyświetlić wszystkie książki z imieniem lub nazwiskiem autora rozpoczynającym się na literę "A",
//zaimplementuj wyszukiwanie książki po zadanym w request parametrze title,
//w przypadku parametru title wyszukiwanie powinno działać w ten sam sposób jak dla parametru author (można podać dowolny ciąg znaków).

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.repository.Books;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("find-book")
public class FindBook extends HttpServlet {
  Books books = new Books();

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    PrintWriter printWriter = resp.getWriter();

    if (req.getParameter("author") == null || req.getParameter("author").isEmpty()) {
      resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
      return;
    }
    String authorName = req.getParameter("author");
    String bookTitle = req.getParameter("title");
    printWriter.println("Watorsc pola author: " + authorName);
    printWriter.println("Watorsc pola title: " + bookTitle);
    printWriter.println("Znalezione ksiazki: \n");
    for (Book book : books.getBooks()) {
      boolean authorFlag = false;
      boolean titleFlag = false;
      if (authorName.equalsIgnoreCase(book.getAuthor())) authorFlag = true;
      else {
        String[] nameArray = book.getAuthor().split("\\s");
        for (int i = 0; i < nameArray.length; i++) {
          if (authorName.length()> nameArray[i].length()) continue;
          else if (findByName(authorName, nameArray[i])) authorFlag = true;
        }
      }
     if (bookTitle != null && !(bookTitle.isEmpty()))
      {
        if (bookTitle.equalsIgnoreCase(book.getTitle())) titleFlag = true;
        else {
          String[] titleArray = book.getTitle().split("\\s");
          for (int i = 0; i < titleArray.length ; i++) {
            if (bookTitle.length() > titleArray[i].length()) continue;
            else if (findByName(bookTitle, titleArray[i])) titleFlag = true;
          }
        }

     } else titleFlag = true;
     if (authorFlag && titleFlag) printBookInformation(book, printWriter);
    }
  }
  public boolean findByName(String nameFromUser, String nameExisting) {
    return nameFromUser.equalsIgnoreCase(nameExisting.substring(0, nameFromUser.length()));
  }
  public void printBookInformation(Book book, PrintWriter pw){
    pw.println(book.toString());
  }
}
