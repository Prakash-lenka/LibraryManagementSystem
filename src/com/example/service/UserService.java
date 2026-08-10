package com.example.service;

import com.example.entity.User;

public interface UserService {

    void addUser(User user);
    void deleteUserbyId(int id);
    void deleteUserbyUsername(String username);
    void updateUser(User user);
    void findById(int id);
    void findByUsername(String username);
    void findByEmail(String email);
    void findAll();
    void addBookToCartById(int userId, int bookId, int quantity);
    void addBookToCartByUsername(String username, int bookId, int quantity);
    void deleteBookFromCartById(int userId, int bookId);
    void viewCartById(int userId);
    void viewCartByUsername(String username);
}
