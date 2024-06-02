package com.rakshya.inheritance;

import java.io.Serial;
import java.io.Serializable;

public class Book implements Serializable ,Cloneable{
    @Serial
    private static final long serialVersionUID=8765456;
    private int isbn;
    private String title;
    private String author;
    private String publisher;
    private double price;

    public Book(){
        //default constructor
    }

    public Book(int isbn,String title, String author, String publisher, double price){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
        this.publisher=publisher;
        this.price=price;
    }

    //private member variable are hidden inside object which cannot be accessed from outside
    //getter and setter method are used to provide read and write access respectively


    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        return obj;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                '}';
    }
}
