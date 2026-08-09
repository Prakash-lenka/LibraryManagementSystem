package com.example.repository;

import com.example.entity.Book;
import java.util.*;

public interface BookRepository {

    void addBook(Book book);
    boolean deleteBook(int id);
    boolean updateBookTitle(int id, String title);
    boolean updateBookPrice(int id, double price);
    boolean updateBookDescription(int id, String description);
    boolean updateBookQuantity(int id, int quantity);
    boolean updateBookPublisher(int id, String publisher);
    Book getBookById(int id);
    Book getBookByTitle(String title);
    List<Book> getAllBooks();
}
