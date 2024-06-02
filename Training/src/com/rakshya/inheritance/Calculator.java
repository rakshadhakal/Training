package com.rakshya.inheritance;

import com.rakshya.SolarPowered;

public interface Calculator extends SolarPowered {
    //interface is a blueprint of a class , it is considered fully abstract interface is also not allowed to create object
    //A class and implement an interface.
    //Interface will set a rule for an implementing class to follow
    //Interface is used to create a loosely coupled structure
    int digits=12;   //variables are by default public static final i.e constant
    public abstract void add();
    void subtract();    //in interface methods are public and abstract by default
    void multiply();
    void divide();
    void modulo();
     void poweredOn();

     public static void display(){
         //since java 8 we are allowed to have concreate method in interface
         //1)static methods
         //2)default methods
         System.out.println("Static method inside interface");
     }
     public default void show(){
         System.out.println("Default method inside interface");
     }
}
