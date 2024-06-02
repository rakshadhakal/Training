package com.rakshya.oop;

public class Bicycle {
    static int count;
    int sn;
    String brand;
    String model;
    double price;
    public Bicycle(){
        count++;
        sn=count;
    }
    public void showBicycle(){
        System.out.println("******Bicycle Description******");
        System.out.println("s.n: "+sn);
        System.out.println("Model: "+model);
        System.out.println("Brand: "+brand);
        System.out.println("Price: "+price);
    }

    public static void main(String[] args) {
        Bicycle b1= new Bicycle();
        b1.model = "SM200";
        b1.brand = "yamaha";
        b1.price =20000;
        b1.showBicycle();

    }

}
