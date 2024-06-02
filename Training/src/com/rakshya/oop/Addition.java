package com.rakshya.oop;

public class Addition {
    void add(){
        int a = 12;
        int b = 21;
        System.out.println("Sum of " +a+ "and"+b+ "is"+(a+b));
    }
    //int add(){
       // System.out.println("Addition operation");
      //  return 1+1;
    //}
    //both above methods have same signature as they have same name and parameter list
    //overloading: having same name with different method signature: either by changing parameter type or number of parameter
    void add(int a, int b){
        System.out.println("The sum is"+(a+b));
    }
    int add(double x, double y){
        System.out.println("The sum is"+(x+y));
        return 0;

    }

    public static void main(String[] args) {
        Addition a = new Addition();
        a.add();
        a.add(12,24);
        a.add(22.44, 55.22);
        a.add(22.44f, 33.55f);  //implicitely cast the values int double and call method with double parameters
        a.add(2L,4L);   //this also uses double type method
    }
}
