package com.rakshya.oop;

public class EmployeeTest {
    public static void main(String[] args) {
        Employeee e1 = new Employeee("Raksha","Dhakal" , 50000);
        System.out.println("Yearly Salary for " +e1.getFirst_name()+" "+e1.getLast_name()+":$ "+e1.getYearlySalary());
        e1.applyRaise(10);
        System.out.println("\n After a 10% raise");
        System.out.println("Yearly salary for "+e1.getFirst_name()+" "+e1.getLast_name()+":$"+e1.getYearlySalary());
    }

}
