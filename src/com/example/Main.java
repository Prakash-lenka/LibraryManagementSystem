package com.example;
import com.example.entity.Book;
import com.example.repository.BookRepositoryImpl;

public class Main {

    public static void main(String[] args){

        Book book = new Book(1,"book1","prakash","Good book",100,"prakash texts",1);
        
        
        BookRepositoryImpl impl = new BookRepositoryImpl();

        impl.addBook(book);
        Book b1 = impl.getBookById(1);
        System.out.println(b1.toString());

    }
}
