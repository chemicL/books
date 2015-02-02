package books.api.controller;

import books.api.model.Book;
import books.api.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/books")
    @ResponseBody
    public List<Book> getAll() {
        return bookService.getAllBooks();
    }

    @RequestMapping("/books/{id}")
    public Book get(@PathVariable("id") long id) {
        return bookService.getBook(id);
    }
}
