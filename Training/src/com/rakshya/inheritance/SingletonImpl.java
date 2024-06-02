package com.rakshya.inheritance;

public class SingletonImpl {
    int data;

    public static SingletonImpl obj;   //maintains a single copy of this field
    //this field in itself is an instance of same class
    //singleton pattern aims to maintain single copy of this object

    public static SingletonImpl getInstance(){
        if(obj == null){
            obj = new SingletonImpl();
        }
        return obj;
    }

    private SingletonImpl(){
        //now the object creation cannot occur from outside class
    }
}
