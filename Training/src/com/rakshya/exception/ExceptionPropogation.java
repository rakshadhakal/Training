package com.rakshya.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionPropogation {

    void m1() throws Exception{
        int a=10;
        m2();  //exception propagates to m1 where m2() is being called....
        System.out.println("a = "+a);
        //This method can either throw the same exception thrown by m2 or its parent but,
        //it can never throw the child exception,
    }
    void m2() throws IOException {
        int b =20;
        m3();   //exception propagates to m2 which m3()is being called...
        System.out.println("b = "+b);
        //This method can either throw the same exception or its parent exception
    }
    void m3() throws FileNotFoundException {
        //Add throws for FileNotFoundException to avoid try-catch so who-ever calls m3() must handle the exception occured inside m3()
        throw new FileNotFoundException("File is not available!");
        //manually throw a checked exception
    }

    public static void main(String[] args) {
        ExceptionPropogation ep = new ExceptionPropogation();
        try {
            ep.m1();
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
