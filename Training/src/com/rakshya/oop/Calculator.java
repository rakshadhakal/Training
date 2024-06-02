package com.rakshya.oop;

public class Calculator {
    void calculate(){
        // no return type and no parameter
        System.out.println("Calculations performed");
    }
    int process(){   //different signature as above method
        //return type but no parameter
        System.out.println("data processed");
        return 0;  //return statement as last statement

    }
    void add(int a , int b){
        //no-return type but takes parameter
        System.out.println("The sum is: "+(a+b));
    }
    int sum(int a , int b){
        //with return type and parameter
        return a+b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.calculate();
        System.out.println("Value returned after processing" + c.process());
        c.add(22,33);
        int result = c.sum(10,15);
        System.out.println("the result is "+result);
        int x=21, y=12;
        c.add(x,y);
        c.add(21,12);
        c.add(50,27);
        c.process();

        //when method is called it is either a type:
        //a) call by value:primitive types: where value is copied to a new variable so when we chnge value inside method the original is unaffected
        //b) call by reference:non-primitive:value is passed as reference no copy is made when we change inside a method, the original also is changed
    }
}
