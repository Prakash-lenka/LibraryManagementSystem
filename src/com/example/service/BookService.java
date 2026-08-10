package com.example.service;

import com.example.entity.Book;

public interface BookService {

    void addBook(Book book);
    void deleteBook(int id);
    void updateBookTitle(int id, String title);
    void updateBookPrice(int id, double price);
    void updateBookDescription(int id, String description);
    void updateBookQuantity(int id, int quantity);
    void updateBookPublisher(int id, String publisher);
    void getBookById(int id);
    void getBookByTitle(String title);
    void getAllBooks();

}
