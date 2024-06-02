package com.rakshya.exception;

import java.lang.reflect.Constructor;

public class CheckedDemo {
    //demonstrate the checkedExceptions and handling exception
    //1.ClassNotFoundException
    //2.FileNotFoundException
    //3.IoException
    //4.SQLException

    public static void main(String[] args) {
        try {
            Class c = Class.forName("com.rakshya.oop.Employeee");
            //forName() method throws exception
            //the error is resolvers only when we handle this exception
            System.out.println("Class Name: " + c.getName());
            Constructor con = c.getDeclaredConstructor();
        }catch (ClassNotFoundException | NoSuchMethodException e){
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Normal flow of program");
    }
}
