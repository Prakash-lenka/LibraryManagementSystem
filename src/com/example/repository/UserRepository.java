package com.example.repository;

import com.example.entity.User;
import com.example.entity.Book;
import java.util.List;

public interface UserRepository {

    void addUser(User user);
    boolean deleteUserbyId(int id);
    boolean deleteUserbyUsername(String username);
    boolean updateUser(User user);
    User findById(int id);
    User findByUsername(String username);
    User findByEmail(String email);
    List<User> findAll();
    boolean addBookToCartById(int userId, int bookId, int quantity);
    boolean addBookToCartByUsername(String username, int bookId, int quantity);
    boolean deleteBookFromCartById(int userId, int bookId);
    List<Book> viewCartById(int userId);
    List<Book> viewCartByUsername(String username);
    

}
