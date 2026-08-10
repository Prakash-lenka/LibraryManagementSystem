package com.example.service;

import java.util.List;

import com.example.entity.Book;
import com.example.repository.BookRepositoryImpl;

public class BookServiceImpl implements BookService {

    BookRepositoryImpl service = new BookRepositoryImpl();
 
    @Override
    public void addBook(Book book){
        service.addBook(book);
        System.out.println("Book Added Successfully.");
    }

    @Override
    public void deleteBook(int id){
        boolean isDeleted = service.deleteBook(id);

        if(isDeleted){
            System.out.println("Book deleted Successfully.");
        }
        else{
            System.out.println("Sorry Book not found. try again!");
        }

    }

    @Override
    public void updateBookTitle(int id, String title){
        boolean isUpdated = service.updateBookTitle(id, title);
        if(isUpdated){
            System.out.println("Book Title Updated Successfully.");
        }
        else{
            System.out.println("Sorry Book not found. try again!");
        }
    }

    @Override
    public void updateBookPrice(int id, double price){
        boolean isUpdated = service.updateBookPrice(id, price);
        if(isUpdated){
            System.out.println("Book Price Updated Successfully.");
        }
        else{
            System.out.println("Sorry Book not found. try again!");
        }
    }

    @Override
    public void updateBookDescription(int id, String description){
        boolean isUpdated = service.updateBookDescription(id, description);
        if(isUpdated){
            System.out.println("Book Description Updated Successfully.");
        }
        else{
            System.out.println("Sorry Book not found. try again!");
        }
    }

    @Override
    public void updateBookQuantity(int id, int quantity){
        boolean isUpdated = service.updateBookQuantity(id, quantity);
        if(isUpdated){
            System.out.println("Book Quantity Updated Successfully.");
        }
        else{
            System.out.println("Sorry Book not found. try again!");
        }
    }

    @Override
    public void updateBookPublisher(int id, String publisher){
        boolean isUpdated = service.updateBookPublisher(id, publisher);
        if(isUpdated){
            System.out.println("Book Publisher Updated Successfully.");
        }
        else{
            System.out.println("Sorry Book not found. try again!");
        }
    }

    @Override
    public void getBookById(int id){
        Book book = service.getBookById(id);

        if(book == null){
            System.out.println("Sorry, Book not found. try again!");
        }
        else{
            System.out.println(book.toString());
        }
    }

    @Override
    public void getBookByTitle(String title){
        Book book = service.getBookByTitle(title);

        if(book == null){
            System.out.println("Sorry, Book not found. try again!");
        }
        else{
            System.out.println(book.toString());
        }
    }

    @Override
    public void getAllBooks(){
        List<Book> books = service.getAllBooks();
        if(books.isEmpty()){
            System.out.println("No books found.");
            return;
        }
        System.out.println("All books: "+books.size()+ " books found.");
        for(Book book : books){
            System.out.println(book.toString());
        }
    }
}
