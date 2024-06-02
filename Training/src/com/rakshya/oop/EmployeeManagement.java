package com.rakshya.oop;

public class EmployeeManagement {
    public static void main(String[] args) {
        System.out.println("Employee management");
        Employee emp = new Employee();
        //within same package
        emp.id=111;
        emp.name="Raksha";
        emp.department="IT";
        emp.profession="coding";   //all member are accessible within class
       // emp.salary=15500;             //private member not accessible outside within class
        emp.showEmployee();
        //emp.raiseSalary(500);

    }
}
