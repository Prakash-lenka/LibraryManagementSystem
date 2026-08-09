package com.example;

import java.util.*;
import com.example.entity.Book;
import com.example.service.*;;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        System.out.println("Hello! User Welcome to the Library Management System.");
        System.out.println();

        int choice;


        do{
            System.out.println("Please choose one of the service from below options and enter the number.");
            System.out.println("1.Book");
            System.out.println("2.User");
            System.out.println("3.Loan");
            System.out.println("4.Exit");
            System.out.print("Enter: ");

            choice = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch(choice){
                // **** Book****
                case 1:
                    System.out.println("Now you're in Book tab");

                    BookService service = new BookServiceImpl();

                    int bookChoice;
                    do{
                        System.out.println("choose one of the service below.");
                        System.out.println("1.Add Book");
                        System.out.println("2.Delete Book");
                        System.out.println("3.Update Book");
                        System.out.println("4.View Books");
                        System.out.println("5.-> Main page");
                        System.out.println();

                        System.out.print("Enter Book service choice: ");
                        bookChoice = sc.nextInt();
                        sc.nextLine();

                        switch(bookChoice){
                            // **** Add Book****
                            case 1:
                                System.out.print("Id: ");
                                int id = sc.nextInt();
                                sc.nextLine();

                                System.out.print("Title: ");
                                String title = sc.nextLine();

                                System.out.print("Author: ");
                                String author = sc.nextLine();

                                System.out.print("Description: ");
                                String description = sc.nextLine();

                                System.out.print("Price: ");
                                double price = sc.nextDouble();
                                sc.nextLine();

                                System.out.print("Publisher: ");
                                String publisher = sc.nextLine();

                                System.out.print("Quantity: ");
                                int quantity = sc.nextInt();

                                System.out.println();

                                Book book = new Book(id, title, author, description, price, publisher, quantity);
                                service.addBook(book);
                                break;
                            case 2:
                                // **** Delete Book****
                                System.out.print("Id: ");
                                service.deleteBook(sc.nextInt());
                                break;
                            case 3:
                                // **** update Book****
                                int bookUpdateChoice;
                                do{
                                    System.out.println("what you wanna update? please choose below.");
                                    System.out.println("1.Title");
                                    System.out.println("2.Description");
                                    System.out.println("3.Price");
                                    System.out.println("4.Publisher");
                                    System.out.println("5.Quantity");
                                    System.out.println("6.-> go back");
                                    System.out.println();

                                    System.out.print("Enter book update choice: ");
                                    bookUpdateChoice = sc.nextInt();
                                    sc.nextLine();
                                    
                                    switch (bookUpdateChoice) {
                                        // **** update Book title ****
                                        case 1:
                                            System.out.print("Id: ");
                                            int uid1 = sc.nextInt();
                                            sc.nextLine();

                                            System.out.println("Title: ");
                                            service.updateBookTitle(uid1,sc.nextLine());
                                            System.out.println();
                                            break;
                                        case 2:
                                            // **** update Book Description ****
                                            System.out.print("Id: ");
                                            int uid2 = sc.nextInt();
                                            sc.nextLine();

                                            System.out.println("Description: ");
                                            service.updateBookDescription(uid2, sc.nextLine());
                                            System.out.println();
                                            break;
                                        case 3:
                                            // **** update Book price ****
                                            System.out.print("Id: ");
                                            int uid3 = sc.nextInt();
                                            sc.nextLine();

                                            System.out.println("Price: ");
                                            service.updateBookPrice(uid3,sc.nextDouble());
                                            System.out.println();
                                            break;
                                        case 4:
                                            // **** update Book publisher ****
                                            System.out.print("Id: ");
                                            int uid4 = sc.nextInt();
                                            sc.nextLine();

                                            System.out.println("Publisher: ");
                                            service.updateBookPublisher(uid4,sc.nextLine());
                                            System.out.println();
                                            break;
                                        case 5:
                                            // **** update Book quantity ****
                                            System.out.print("Id: ");
                                            int uid = sc.nextInt();
                                            sc.nextLine();

                                            System.out.println("quantity: ");
                                            service.updateBookQuantity(uid,sc.nextInt());
                                            System.out.println();
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Invalid choice. Try again!");
                                            break;
                                    }

                                }while(bookUpdateChoice!=6);
                                break;
                            case 4:
                                // **** View Book ****
                                int bookViewChoice;

                                do{
                                    System.out.println("choose the below viewing options");
                                    System.out.println("1.View by Id.");
                                    System.out.println("2.View by Title.");
                                    System.out.println("3.View all Books.");
                                    System.out.println("4.-> go back");
                                    System.out.println();

                                    System.out.print("Enter book view choice: ");
                                    bookViewChoice = sc.nextInt();
                                    sc.nextLine();

                                    switch (bookViewChoice) {
                                        // **** View Book by Id ****
                                        case 1:
                                            System.out.println("Id: ");
                                            service.getBookById(sc.nextInt());
                                            System.out.println();
                                            
                                            break;
                                        case 2:
                                            // **** View Book by title ****
                                            System.out.println("Title: ");
                                            service.getBookByTitle(sc.nextLine());    
                                            System.out.println();   
                                            break;
                                        case 3:
                                            // **** View all Books ****
                                            service.getAllBooks();
                                            System.out.println();
                                            break;
                                    
                                        case 4:
                                            break;
                                        default:
                                            System.out.println("Invalid choice. Try again!");                                          
                                            break;
                                    }
                                }while(bookViewChoice!=4);
                                break;

                            case 5:
                                break;
                            default:
                                System.out.println("Invalid choice. Try again!");
                                break;
                        }

                    }while(bookChoice!=5);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice. Try again!");
                    break;
                                            
            }


        }while(choice!=4);
    }
}
