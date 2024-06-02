package com.rakshya.inheritance;

public class Novel extends  Books{
    public int year;
    public String genre;

    public void showBooksInfo(){
        System.out.println("******Novel Information*******");
        System.out.println("Book Published Year: "+year);
        System.out.println("Genre of book: "+genre);
    }

    public static void main(String[] args) {
        Books b1= new Books();
        b1.isbn=13445;
        b1.title="Summer love";
        b1.author="Subin Bhattrai";
        b1.publisher="Fine Print";
        b1.price=375.00;
        b1.displayInfo();
        Novel n1 = new Novel();
        n1.year=2012;
        n1.genre="Love";
        n1.showBooksInfo();

    }
}
