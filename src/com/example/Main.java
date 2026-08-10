package com.example;

import java.util.*;
import com.example.entity.*;
import com.example.service.*;

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
            System.out.println("3.Loan Record");
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
                case 2:
                    // **** User ****
                    System.out.println("Now you're in User tab");

                    UserService userService = new UserServiceImpl();
                    int userChoice;

                    do{
                        System.out.println("choose one of the service below.");
                        System.out.println("1.Add User");
                        System.out.println("2.Delete User");
                        System.out.println("3.Update User");
                        System.out.println("4.View User");
                        System.out.println("5.User Cart");
                        System.out.println("6.-> Main page");
                        System.out.println();

                        System.out.print("Enter User service choice: ");
                        userChoice = sc.nextInt();
                        sc.nextLine();

                        switch(userChoice){
                            case 1:
                                // **** Add User ****
                                System.out.print("Id: ");
                                int id = sc.nextInt();
                                sc.nextLine();

                                System.out.print("Username: ");
                                String username = sc.nextLine();

                                System.out.print("Full Name: ");
                                String fullName = sc.nextLine();

                                System.out.print("Contact No: ");
                                String contactNo = sc.nextLine();

                                System.out.print("Email: ");
                                String email = sc.nextLine();

                                System.out.print("Password: ");
                                String password = sc.nextLine();

                                System.out.print("Role: ");
                                String role = sc.nextLine();

                                System.out.print("DOB: ");
                                String dob = sc.nextLine();

                                User user = new User(id, username, fullName, contactNo, email, password, role, dob);
                                userService.addUser(user);
                                break;
                            case 2:
                                // **** Delete User ****
                                int deleteChoice;
                                do{
                                    System.out.println("choose the below deleting options");
                                    System.out.println("1.Delete by Id.");
                                    System.out.println("2.Delete by Username.");
                                    System.out.println("3.-> go back");
                                    System.out.println();

                                    System.out.print("Enter user delete choice: ");
                                    deleteChoice = sc.nextInt();
                                    sc.nextLine();

                                    switch (deleteChoice) {
                                        case 1:
                                            // **** Delete User by Id ****
                                            System.out.print("Id: ");
                                            userService.deleteUserbyId(sc.nextInt());
                                            break;
                                        case 2:
                                            // **** Delete User by Username ****
                                            System.out.print("Username: ");
                                            userService.deleteUserbyUsername(sc.nextLine());
                                            break;
                                        case 3:
                                            break;
                                        default:
                                            System.out.println("Invalid choice. Try again!");
                                            break;
                                    }
                                }while(deleteChoice!=3);
                                break;
                            case 3:
                                // **** Update User ****
                                System.out.print("Id: ");
                                int uid = sc.nextInt();
                                sc.nextLine();

                                System.out.print("Username: ");
                                String uusername = sc.nextLine();

                                System.out.print("Full Name: ");
                                String ufullName = sc.nextLine();

                                System.out.print("Contact No: ");
                                String ucontactNo = sc.nextLine();

                                System.out.print("Email: ");
                                String uemail = sc.nextLine();

                                System.out.print("Password: ");
                                String upassword = sc.nextLine();

                                System.out.print("Role: ");
                                String urole = sc.nextLine();

                                System.out.print("DOB: ");
                                String udob = sc.nextLine();

                                User updateUser = new User(uid, uusername, ufullName, ucontactNo, uemail, upassword, urole, udob);
                                userService.updateUser(updateUser);
                                break;
                            case 4:
                                // **** View User ****
                                int viewChoice;
                                do{
                                    System.out.println("choose the below viewing options");
                                    System.out.println("1.View by Id.");
                                    System.out.println("2.View by Username.");
                                    System.out.println("3.View by Email.");
                                    System.out.println("4.View all Users.");
                                    System.out.println("5.-> go back");
                                    System.out.println();

                                    System.out.print("Enter user view choice: ");
                                    viewChoice = sc.nextInt();
                                    sc.nextLine();

                                    switch (viewChoice) {
                                        case 1:
                                            // **** View User by Id ****
                                            System.out.print("Id: ");
                                            userService.findById(sc.nextInt());
                                            break;
                                        case 2:
                                            // **** View User by Username ****
                                            System.out.print("Username: ");
                                            userService.findByUsername(sc.nextLine());
                                            break;
                                        case 3:
                                            // **** View User by Email ****
                                            System.out.print("Email: ");
                                            userService.findByEmail(sc.nextLine());
                                            break;
                                        case 4:
                                            // **** View all Users ****
                                            userService.findAll();
                                            break;
                                        case 5:
                                            break;
                                        default:
                                            System.out.println("Invalid choice. Try again!");
                                            break;
                                    }
                                }while(viewChoice!=5);
                                break;
                            case 5:
                                // **** User Cart ****
                                int cartChoice;
                                do{
                                    System.out.println("choose the below cart options");
                                    System.out.println("1.Add Book to Cart by Id.");
                                    System.out.println("2.Add Book to Cart by Username.");
                                    System.out.println("3.Delete Book from Cart by Id.");
                                    System.out.println("4.View Cart by Id.");
                                    System.out.println("5.View Cart by Username.");
                                    System.out.println("6.-> go back");
                                    System.out.println();

                                    System.out.print("Enter user cart choice: ");
                                    cartChoice = sc.nextInt();
                                    sc.nextLine();

                                    switch (cartChoice) {
                                        case 1:
                                            // **** Add Book to Cart by Id ****
                                            System.out.print("User Id: ");
                                            int userId = sc.nextInt();
                                            sc.nextLine();

                                            System.out.print("Book Id: ");
                                            int bookId = sc.nextInt();
                                            sc.nextLine();

                                            System.out.print("Quantity: ");
                                            int quantity = sc.nextInt();
                                            sc.nextLine();

                                            userService.addBookToCartById(userId, bookId, quantity);
                                            break;
                                        case 2:
                                            // **** Add Book to Cart by Username ****
                                            System.out.print("Username: ");
                                            String username1 = sc.nextLine();

                                            System.out.print("Book Id: ");
                                            int bookId2 = sc.nextInt();
                                            sc.nextLine();

                                            System.out.print("Quantity: ");
                                            int quantity2 = sc.nextInt();
                                            sc.nextLine();

                                            userService.addBookToCartByUsername(username1, bookId2, quantity2);
                                            break;
                                        case 3:
                                            // **** Delete Book from Cart by Id ****
                                            System.out.print("User Id: ");
                                            int userId3 = sc.nextInt();
                                            sc.nextLine();

                                            System.out.print("Book Id: ");
                                            int bookId3 = sc.nextInt();
                                            sc.nextLine();

                                            userService.deleteBookFromCartById(userId3, bookId3);
                                            break;
                                        case 4:
                                            // **** View Cart by Id ****    
                                            System.out.print("User Id: ");
                                            int userId4 = sc.nextInt();
                                            sc.nextLine();
                                            userService.viewCartById(userId4);
                                            break;
                                        case 5:
                                            // **** View Cart by Username ****
                                            System.out.print("Username: ");
                                            String username5 = sc.nextLine();
                                            userService.viewCartByUsername(username5);
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Invalid choice. Try again!");
                                    }
                                }while(cartChoice!=6);
                                break;
                            case 6:
                                break;
                            default:
                                System.out.println("Invalid choice. Try again!");
                                break;
                        }
                    }while(userChoice!=6);
                
                break;
                case 3:
                    // **** Loan Record ****
                    System.out.println("Now you're in Loan Record tab");
                    break;
                case 4:
                    System.out.println("Thank you for using the Library Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again!");
                    break;
                                            
            }


        }while(choice!=4);
        sc.close();
    }
}
