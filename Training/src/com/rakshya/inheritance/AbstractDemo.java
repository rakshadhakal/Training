package com.rakshya.inheritance;

public abstract class AbstractDemo {
    //when a class holds and abstract method the class should also be declared as abstract hence
    //Such abstract class is not allowed  to instantiate
    //But it can participate in inheritance to create a subclass which if implements the abstract method would be allowed
    //become concrete (not-abstract) and is allowed to instantiate
    int data;
    public abstract void processData();
    //method without body is called abstract method
    //declared using keyword abstract

    public void showData(){
        System.out.println("Data is "+data);
    }

    public static void main(String[] args) {

    }
}
