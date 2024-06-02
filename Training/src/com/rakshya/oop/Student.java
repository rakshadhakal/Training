package com.rakshya.oop;

public class Student {
    public int id;
    public String name;
    public String address;
    public int age;
    public static String collegename;
    public void showStudent(){
        System.out.println("Student id: "+id);
        System.out.println("Student name: "+name);
        System.out.println("Student address= "+address);
        System.out.println("Student age= "+age);
        System.out.println("Student College Name: "+collegename);
    }
}
