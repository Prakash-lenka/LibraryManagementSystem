package com.example.service;

import com.example.entity.User;
import com.example.entity.Book;
import com.example.repository.*;
import java.util.*;

public class UserServiceImpl implements UserService {

    private UserRepository userService = new UserRepositoryImpl();

    public UserServiceImpl() {
    }

    @Override
    public void addUser(User user) {
        userService.addUser(user);
        System.out.println("User added successfully.");
    }

    @Override
    public void deleteUserbyId(int id) {
        userService.deleteUserbyId(id);
        System.out.println("User deleted successfully.");
    }

    @Override
    public void deleteUserbyUsername(String username) {
        userService.deleteUserbyUsername(username);
        System.out.println("User deleted successfully.");
    }

    @Override
    public void updateUser(User user) {
        userService.updateUser(user);
        System.out.println("User updated successfully.");
    }

    @Override
    public void findById(int id) {
        User user = userService.findById(id);
        if (user != null) {
            System.out.println("User found: " + user.toString());
        } else {
            System.out.println("User not found.");
        }
    }

    @Override
    public void findByUsername(String username) {
        User user = userService.findByUsername(username);
        if (user != null) {
            System.out.println("User found: " + user.toString());
        } else {
            System.out.println("User not found.");
        }
    }

    @Override
    public void findByEmail(String email) {
        User user = userService.findByEmail(email);
        if (user != null) {
            System.out.println("User found: " + user.toString());
        } else {
            System.out.println("User not found.");
        }
    }

    @Override
    public void findAll() {
        List<User> users = userService.findAll();
        if (!users.isEmpty()) {
            System.out.println("All users: "+users.size()+ " users found.");
            for (User user : users) {
                System.out.println(user.toString());
            }
        } else {
            System.out.println("No users found.");
        }
    }

    @Override
    public void addBookToCartById(int userId, int bookId, int quantity) {
        boolean isAdded = userService.addBookToCartById(userId, bookId, quantity);
        if (isAdded) {
            System.out.println("Book added to cart successfully.");
        } else {
            System.out.println("Failed to add book to cart. User or Book not found.");
        }
    }

    @Override
    public void addBookToCartByUsername(String username, int bookId, int quantity) {
        boolean isAdded = userService.addBookToCartByUsername(username, bookId, quantity);
        if (isAdded) {
            System.out.println("Book added to cart successfully.");
        } else {
            System.out.println("Failed to add book to cart. User or Book not found.");
        }
    }

    @Override
    public void deleteBookFromCartById(int userId, int bookId) {
        boolean isDeleted = userService.deleteBookFromCartById(userId, bookId);
        if (isDeleted) {
            System.out.println("Book removed from cart successfully.");
        } else {
            System.out.println("Failed to remove book from cart. User or Book not found.");
        }
    }

    @Override
    public void viewCartById(int userId) {
        List<Book> cart = userService.viewCartById(userId);
        if (cart != null && !cart.isEmpty()) {
            System.out.println("User's Cart:");
            for (Book book : cart) {
                System.out.println(book.toString());
            }
        } else {
            System.out.println("Cart is empty or user not found.");
        }
    }

    @Override
    public void viewCartByUsername(String username) {
        List<Book> cart = userService.viewCartByUsername(username);
        if (cart != null && !cart.isEmpty()) {
            System.out.println("User's Cart:");
            for (Book book : cart) {
                System.out.println(book.toString());
            }
        } else {
            System.out.println("Cart is empty or user not found.");
        }
    }

}
