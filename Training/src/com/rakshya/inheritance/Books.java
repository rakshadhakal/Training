package com.rakshya.inheritance;

public class Books {
    public int isbn;
    public String title;
    public String author;
    public String publisher;
    public double price;



    public void displayInfo(){
        System.out.println("*********Book Information*********");
        System.out.println("Isbn number of book: "+isbn);
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Publisher: "+publisher);
        System.out.println("Price: "+price);
    }
}
