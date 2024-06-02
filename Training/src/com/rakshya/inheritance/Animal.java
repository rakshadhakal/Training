package com.rakshya.inheritance;

public class Animal {   //Generalization of all animals
    int age;
    static String planet;
    public void feed(){
        System.out.println("Animal feeds");
    }
    public static void breathe(){
        System.out.println("Animals breathes air");
    }
    public void move(){
        System.out.println("Animal moves");
    }
}
