package com.rakshya.inheritance;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CreatingObjects {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, CloneNotSupportedException {
        //1. Creating object using new Keyword
        Book b1 = new Book(23343,"java","James","Hill",2345);

        //2.Using reflection technique
        Class c1 = Class.forName("com.rakshya.inheritance.Book");
        Constructor con = c1.getDeclaredConstructor();
        Book b2 = (Book) con.newInstance();
        b2.setAuthor("James Camaron");

        //3.Using cloning technique
        Book b3 = (Book) b1.clone();
        System.out.println("Original: "+b1.toString());
        System.out.println("Clone: "+b3.toString());
        //clone object are created by using field to field copy of one object into anotherc  c
    }
}
