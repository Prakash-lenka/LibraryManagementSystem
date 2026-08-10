package com.example.repository;

import com.example.entity.User;
import com.example.entity.Book;
import com.example.repository.BookRepository;
import java.util.*;

public class UserRepositoryImpl implements UserRepository {

    List<User> users = new ArrayList<>();
    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public boolean deleteUserbyId(int id) {
        for(User user : users){
            if(user.getId() == id){
                users.remove(user); 
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteUserbyUsername(String username) {
        for(User user : users){
            if(user.getUsername().equals(username)){
                users.remove(user);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateUser(User user) {
        for(int i = 0; i < users.size(); i++){
            if(users.get(i).getId() == user.getId()){
                users.set(i, user);
                return true;
            }
        }
        return false;
    }

    @Override
    public User findById(int id) {
        for(User user : users){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }

    @Override
    public User findByUsername(String username) {
        for(User user : users){
            if(user.getUsername().equals(username)){
                return user;
            }
        }
        return null;
    }

    @Override
    public User findByEmail(String email) {
        for(User user : users){
            if(user.getEmail().equals(email)){
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    private BookRepository bookRepository = new BookRepositoryImpl();
    
    @Override
    public boolean addBookToCartById(int userId, int bookId, int quantity) {
        User user = findById(userId);
        if (user != null) {
            List<Book> cart = user.getCart();
            Book book = bookRepository.getBookById(bookId);
            if (book != null) {
                cart.add(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addBookToCartByUsername(String username, int bookId, int quantity) {
        User user = findByUsername(username);
        if (user != null) {
            List<Book> cart = user.getCart();
            Book book = bookRepository.getBookById(bookId);
            if (book != null) {
                cart.add(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteBookFromCartById(int userId, int bookId) {
        User user = findById(userId);
        if (user != null) {
            List<Book> cart = user.getCart();
            for (Book book : cart) {
                if (book.getId() == bookId) {
                    cart.remove(book);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public List<Book> viewCartById(int userId) {
        User user = findById(userId);
        if (user != null) {
            return user.getCart();
        }
        return Collections.emptyList();
    }

    @Override
    public List<Book> viewCartByUsername(String username) {
        User user = findByUsername(username);
        if (user != null) {
            return user.getCart();
        }
        return Collections.emptyList();
    }

}
