package com.rakshya.oop;

public class ComplexNumber {
    public double real;
    public double imag;
    public static ComplexNumber addComplex(ComplexNumber c1, ComplexNumber c2){
        ComplexNumber c = new ComplexNumber();
        c.real = c1.real + c2.real;
        c.imag = c1.imag + c2.imag;
        return c;
    }

    public void show(){
        System.out.println(real+ "i" +imag);

    }

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber();
        a.real = 5;
        a.imag = 3.5;

        ComplexNumber b = new ComplexNumber();
        b.real = 2.8;
        b.imag = 4.8;
        b.show();
        System.out.println("Sum of complex number is: ");
        ComplexNumber sum = addComplex(a,b);
        sum.show();

    }
}
