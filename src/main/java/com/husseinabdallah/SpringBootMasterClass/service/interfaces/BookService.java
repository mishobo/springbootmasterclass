package com.husseinabdallah.SpringBootMasterClass.service.interfaces;

import com.husseinabdallah.SpringBootMasterClass.model.Book;

import java.util.HashSet;

public interface BookService {

    HashSet<Book> findAllBook();
    Book findBookByID(long id);
    void addBook(Book b);
    void deleteAllData();


}
