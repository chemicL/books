package books.api.service;

import books.api.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Override
    public Book getBook(Long id) {
        Book book = new Book();
        book.setAuthor("J.R.R. Tolkien");
        book.setTitle("The Fellowship of The Ring");
        return book;
    }

    @Override
    public List<Book> getAllBooks() {
        List<Book> allBooks = new ArrayList<Book>();
        Book b1 = new Book();
        b1.setAuthor("Stanislaw Lem");
        b1.setTitle("Solaris");

        Book b2 = new Book();
        b2.setAuthor("J.R.R. Tolkien");
        b2.setTitle("The Fellowship of The Ring");
        allBooks.add(b1);
        allBooks.add(b2);
        return allBooks;
    }
}
