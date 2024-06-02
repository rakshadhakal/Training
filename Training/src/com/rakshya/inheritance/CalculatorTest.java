package com.rakshya.inheritance;

public class CalculatorTest {
    public static void main(String[] args) {
        CasioCalculator c = new CasioCalculator();
        c.op1=63;
        c.op2=45;
        c.subtract();
        System.out.println("***********Calculator************");
        System.out.println("Substraction of op1 and op2 : "+c.result);
        c.divide();
        System.out.println("Division of op1 and op2 : "+c.result);
        c.add();
        System.out.println("Addition of op1 and op2 : "+c.result);

        //accessing scientific features
        c.sine();
        System.out.println("Sine Result: "+c.result);
        c.log();
        System.out.println("log Result : "+c.result);

        //selecting regular mode
        Calculator cc = c;
        cc.divide();
       // cc.sine();//since casio calculator is in calculator mode

        ScientificCalculator sc = c;
        sc.tan();
        //sc.multiply();    since we are on ScientificCalculator Mode
    }
}
