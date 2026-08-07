package com.example.repository;


import java.util.*;

import com.example.entity.Book;

public class BookRepositoryImpl implements BookRepository {

    private List<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book){
        books.add(book);
    }

    @Override
    public boolean deleteBook(int id){
        for(Book book:books){

            if(book.getId() == id){
                books.remove(book);
                return true;
            }
        }

        return false;
        

    }

    @Override
    public boolean updateBookTitle(int id, String title){
        for(Book book:books){

            if(book.getId() == id){
                book.setTitle(title);
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean updateBookPrice(int id, double price){
        for(Book book:books){

            if(book.getId() == id){
                book.setPrice(price);
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean updateBookDescription(int id, String description){
        for(Book book:books){

            if(book.getId() == id){
                book.setDescription(description);
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean updateBookPublisher(int id, String publisher){
        for(Book book:books){

            if(book.getId() == id){
                book.setPublisher(publisher);
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean updateBookQuantity(int id, int quantity){
        for(Book book:books){

            if(book.getId() == id){
                book.setQuantity(quantity);
                return true;
            }
        }

        return false;
    }

    @Override
    public Book getBookById(int id){

        for(Book book : books){
            if(book.getId() == id){
                return book;
            }
        }
        return null;
    }

    @Override
    public Book getBookByTitle(String title){

        for(Book book : books){
            if(book.getTitle() == title){
                return book;
            }
        }
        return null;
    }

    @Override
    public List<Book> getAllBooks(){
        return books;
    }
}
