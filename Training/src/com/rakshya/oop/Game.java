package com.rakshya.oop;

public class Game {
    public static void main(String[] args) {
        Ball b1 = new Ball();
        b1.showBall();  //shows default valuues initialized by default constructor
        b1.type ="Football";
        b1.color = "White";
        b1.size = 7;
        b1.showBall();    //show user initialized values
        //compiler will provide us with one default constructor even if we do not declare any constructors on our own


        Ball b2 = new Ball (10);
        b2.showBall();

        Ball b3= new Ball(12,"RUGBY","Brown");
        b3.showBall();
    }
}
