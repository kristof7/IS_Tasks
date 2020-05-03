package com.isa.bookcase.repository;

import com.isa.bookcase.domain.Category;
import com.isa.bookcase.domain.Book;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Stateless
public class Books implements BooksRepository{

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
    public List<Book> showAllBooks() {
        return importBooks();
    }

    @Override
    public Book showRandomBook() {
        Random random = new Random();
        return showAllBooks().get(random.nextInt(showAllBooks().size()));
    }

    @Override
    public Optional<Book> findByAuthor(String author) {
        return showAllBooks().stream().filter(book -> book.getAuthor().equals(author)).findFirst();
    }

    @Override
    public Optional<Book> findByTitle(String title) {
        return showAllBooks().stream().filter(book -> book.getTitle().equals(title)).findFirst();
    }
}
