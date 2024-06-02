package com.rakshya.inheritance;

public class Car {
    public int seat_capacity;
    public String model;
    public String brand;
    public final Engine engine;   //one-to-one relation between car and engine object
    //final keyword enforces a car must have an engine

    public Car(){
        engine=new Engine(1800,160,"Mitsubishu");
        //car is provided a engine during car construction
        //thus creating a strong rlation between car and engine object
    }
    public Car(String brand, String model, int seat_capacity , Engine engine){
        this.engine=engine;
        this.brand=brand;
        this.model=model;
        this.seat_capacity=seat_capacity;
    }

    public static void main(String[] args) {
        Car c1= new Car();
        c1.engine.showEngine();

        Engine egg = new Engine(50,121,"Toyota");
        Car c2= new Car("Roolls Royace","TP1200",7,egg);
        c2.engine.showEngine();
    }
}
