package com.rakshya.inheritance;

public class AbstractImpl extends AbstractDemo{

    //this class inherits members from AbstractDemo class
    //one of those member is an abstract , which is also inherited
    //so we can say this class also contains an abstract method
    //either this class should also be declared abstract, or implement
    //that abstract method here

    @Override
    public void processData() {
       //implementing abstract method from super class
        System.out.println("Square of data is "+Math.sqrt(data));
    }

    public static void main(String[] args) {
        AbstractDemo ad = new AbstractImpl();
        ad.data = 12;
        ad.showData();
        ad.processData();

        //even-though the method is accessed using ad a reference of AbstarctDemo class, the dynamic method dispatch technique sees
        //the object an AbstractImplementation on ad reference and uses the method overridden on AbstractImpl class
    }
}
