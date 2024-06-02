package com.rakshya.inheritance;

public class Engine {
    int size;   //in cc
    double hp;  //nm
    String mfg;  //manufacture of engine

    public Engine(int size, double hp, String mfg){
        this.size=size;
        this.hp=hp;
        this.mfg=mfg;
    }

    public void showEngine(){
        System.out.println("---------------------Engine Specification---------------------");
        System.out.println("Manufacturer: "+mfg);
        System.out.println("Power: "+hp);
        System.out.println("Size: "+size);
        System.out.println("-------------------------------------");
    }



}
