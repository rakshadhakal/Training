package com.rakshya.inheritance;

public class SingletonTest {
    public static void main(String[] args) {
        SingletonImpl si =  SingletonImpl.getInstance();
        si.data = 5;
        System.out.println("data: "+si.data);
        si=null;
        SingletonImpl is = SingletonImpl.getInstance();
        System.out.println("Data: "+is.data);
    }
}
