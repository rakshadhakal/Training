package com.rakshya.exception;

import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {
        int a;
        //input a using scanner
        try(Scanner sc = new Scanner(System.in)) {
            a = sc.nextInt();
            System.out.println("A is: " + a);
           // sc.close();
        }  //the scanner is closed automatically as soon as we leave this block because Scanner is  auto-close resources
    }
}
