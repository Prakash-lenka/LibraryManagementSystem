package com.example.repository;

import com.example.entity.Book;
import java.util.*;

public interface BookRepository {

    public void addBook(Book book);
    public boolean deleteBook(int id);
    public boolean updateBookTitle(int id, String title);
    public boolean updateBookPrice(int id, double price);
    public boolean updateBookDescription(int id, String description);
    public boolean updateBookQuantity(int id, int quantity);
    public boolean updateBookPublisher(int id, String publisher);
    public Book getBookById(int id);
    public Book getBookByTitle(String title);
    public List<Book> getAllBooks();
}
