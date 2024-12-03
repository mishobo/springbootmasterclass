package com.husseinabdallah.SpringBootMasterClass.controller;

import com.husseinabdallah.SpringBootMasterClass.model.Book;
import com.husseinabdallah.SpringBootMasterClass.service.interfaces.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;

@RestController
@RequestMapping("/api/v1")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


    @PostMapping("/book")
    public void addBook(@RequestBody Book book) {
        bookService.addBook(book);
    }

    @GetMapping("/books")
    public HashSet<Book> getAllBook() {
        return bookService.findAllBook();
    }

    @GetMapping("/book/{id}")
    public Book geBookById(@PathVariable long id) {
        return bookService.findBookByID(id);
    }

    @DeleteMapping("/delete")
    public void deleteBook() {
        bookService.deleteAllData();
    }

}
