package com.rakshya.oop;

public class College {
    public int code;
    public String name;
    public String address;

    public static String university;
    public void showCollege(){
        System.out.printf("College Code: "+code);
        System.out.printf("Name: "+name);
        System.out.printf("Address: "+address );
        System.out.printf("University: "+university);
    }

}
