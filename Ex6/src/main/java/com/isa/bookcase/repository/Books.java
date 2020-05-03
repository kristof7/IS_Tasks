package com.isa.bookcase.repository;

import com.isa.bookcase.domain.Category;
import com.isa.bookcase.domain.Book;

import javax.ejb.Stateless;
import java.util.*;

@Stateless
public class Books implements BooksRepository {

    private List<Book> books;

    public Books() {
        this.books = importBooks();
    }

    public List<Book> getBooks() {
        return books;
    }

    private static List<Book> importBooks() {

        List<Book> books = new ArrayList<>();

        books.add(new Book("Hanya Yanagihara", "Male zycie", Category.LITERATURA_PIEKNA, 816, false));
        books.add(new Book("Maja Lunde", "Historia Pszczol", Category.LITERATURA_PIEKNA, 514, false));
        books.add(new Book("Leonie Swann", "Kroczac w ciemnosci", Category.LITERATURA_PIEKNA, 424, false));
        books.add(new Book("George R.R. Martin", "Gra o tron", Category.FANTASTYKA_SCIENCE_FICTION, 999, false));
        books.add(new Book("J. R. R. Tolkien", "Hobbit", Category.FANTASTYKA_SCIENCE_FICTION, 315, false));
        books.add(new Book("Simon Beckett", "Chemia smierci", Category.KRYMINAL_SENSACJA_THRILLER, 352, false));
        books.add(new Book("Marc Elsberg", "Blackout", Category.KRYMINAL_SENSACJA_THRILLER, 784, false));
        books.add(new Book("Jozef Ignacy Kraszewski", "Stara basn", Category.HISTORYCZNA, 304, false));
        books.add(new Book("J. K. Rowling", "Harry Potter i Kamien Filozoficzny", Category.FANTASTYKA_SCIENCE_FICTION, 328, true));
        books.add(new Book("Antoine de Saint-Exupery", "Maly Ksiaze", Category.LITERATURA_PIEKNA, 112, true));
        books.add(new Book("Jojo Moyes", "Zanim się pojawiłeś", Category.OBYCZAJOWA_ROMANS, 382, false));
        books.add(new Book("Elizabeth Gilbert", "Jedz, modl sie, kochaj", Category.PUBLICYSTYKA_BIOGRAFIA, 490, false));

        return books;
    }

    @Override
    public List<Book> findAllBooks() {
        return importBooks();
    }

    @Override
    public Book findRandomBook() {
        return findAllBooks().get(new Random().nextInt(findAllBooks().size() - 1));
    }

    @Override
    public Set<Book> findByAuthor(String author) {
        Set<Book> findedByAuthorBooks = new HashSet<>();
        for (Book book : books) {
            if (book.getAuthor().substring(0, author.length()).trim().equalsIgnoreCase(author)) {
                findedByAuthorBooks.add(book);
            }
        }
        return findedByAuthorBooks;
    }

    @Override
    public Set<Book> findByTitleAndAuthor(String title, String author) {
        Set<Book> findedByAuthorBooks = findByAuthor(author);
        Set<Book> result = new HashSet<>();
        for (Book book : findedByAuthorBooks) {
            if (book.getTitle().substring(0, title.length()).trim().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }
        return result;
    }
}
