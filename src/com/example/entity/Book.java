package com.example.entity;

public class Book {

    private int id;
    private String title;
    private String author;
    private String description;
    private double price;
    private String publisher;
    private int quantity;

    public Book(){}

    public Book(int id, String title, String author, String description, double price, String publisher, int quantity){
        this.id = id;
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public String getPublisher(){
        return publisher;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }


    @Override
    public String toString(){
        return "Book[id="+id+", title="+title+
        ", description="+description+", author="+author+
        ", price="+price+", publisher="+publisher+
        ", quantity="+quantity+"]";
    }
    

    


}
