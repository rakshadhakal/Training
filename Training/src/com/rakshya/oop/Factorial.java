package com.rakshya.oop;

import java.util.Scanner;

public class Factorial {
    //calculate a factorial of a number using recursion
    static int fact(int i){
        if(i==1)
            return 1;  //stops recursion
        return i* fact(i-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number:");
        int num = sc.nextInt();
        int factorial = fact(num);
        System.out.println("The factorial of "+num + " is "+factorial);
    }
}
