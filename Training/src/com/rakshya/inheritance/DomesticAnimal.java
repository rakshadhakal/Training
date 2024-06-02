package com.rakshya.inheritance;

public class DomesticAnimal extends Animal{
    //animal class is a parent or super
    //DomesticAnimal is a child or sub-class
    //In Inheritance a sub-class inherits all members(Static+non-static)from parent class.this creates a class to class relations

    String region;
    //the sub-class can also add a properties of its own and extend the features provided by a super class ,or even modify those features


    double value;

    public static void main(String[] args) {
        Animal a = new Animal();

        DomesticAnimal da = new DomesticAnimal();
        da.age=12;
        da.region="South Asian";
        da.value=1500;
        da.feed();
        da.move();
        Animal.planet="Earth";              //static members are also inherited
        DomesticAnimal.planet="Earth";
        Animal.breathe();
        DomesticAnimal.breathe();
        //Ability to access the properties defined by parent class as its own by child class is called inheritance

        Animal ad=new DomesticAnimal();
        //As domesticAnimal is also an Animal, we can assign child object to parent reference
        ad.age=14;
        //ad.region ="Mountaneous";
        //when we put an object of a child class into parent class reference,then the child object is cast to a type of parent,
        //so only the features defined by the parent are accessible

        //DomesticAnimal daa = new Animal();
        //Not all animals are domestic animal
        //The super-class object can not initialize all members of sub-class
        //so we cannot assign super class object into subclass reference
    }
}
