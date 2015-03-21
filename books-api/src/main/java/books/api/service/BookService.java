package books.api.service;


import books.api.model.Book;

import java.util.List;

public interface BookService {
    Book getBook(Long id);
    List<Book> getAllBooks();
}
