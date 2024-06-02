package com.rakshya.oop;

public class Ball {
    int size;       //state or attribute or instance variable or non-static variable
    String color;
    String type;

    //Constructor:is a unit used to help initialize abject during its creation
    //Type
    //1)Default
    //2)parameterized
    //construstor look like method but do not have return type and has name as that of the class in which it is created


    //default constructor
    public Ball(){//we can apply only public,private and default(np-specifier)
        //no-argument constructor or default constructor take no argument(empty parenthesis)
        //initialized object(instance variable) with default values
    }
    public Ball(int s) {
       // this();     call to a default constructor, this will create a constructor chaining
      size = s;
    }

    Ball(int size, String type, String color){
        //this(size);  //this() refers to  same class constructor
        this.size=size;   //this refers to current instance
        this.type = type;
        this.color = color;

    }

    public void showBall(){
        System.out.println("Ball detail:");
        System.out.println("Type: "+type);
        System.out.println("color: "+color);
        System.out.println("Size: "+size);
    }
}
