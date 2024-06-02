package com.rakshya.inheritance;

public class Library {
    String address;
    Book[] books;  //this associates library object and book object

    public void showBooks(){
        System.out.println("Books");
        for(Book b:books){
            if(b!=null)
            System.out.println(b.getTitle());
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.address="Lazimpat";
        library.books=new Book[5];
        library.books[0] = new Book();
        library.books[1]= new Book(121,"Muna Madan","Laxmi Prasad Devkota","Sajha",1200);
        library.books[2]=new Book(221,"Shirish ko Phool","Parijat","EKTA",1000);
        library.books[3]=new Book(151,"OOP in java","JOHN","McGraHill",1500);
        library.books[4]=new Book(225,"AI","JACK","PT",1100);
        library.showBooks();

        Library openLibrary=new Library();
        openLibrary.address="Baneswor";
        openLibrary.books=new Book[3];
        openLibrary.showBooks();
    }

}
