package com.rakshya.oop;

public class Employee {
    public int id;
    public String name;
    protected String department;
    String profession;
    private double salary;


    public void  showEmployee(){
        System.out.println("Name: "+name);
        System.out.println("Department: "+department);
        System.out.println("Profession: "+profession);
        System.out.println("Salary: "+salary);


    }
    private void raiseSalary(double raiseAmount){
        salary+=raiseAmount;
    }

    public static void main(String[] args) {
        System.out.println("Employee management");
        Employee emp = new Employee();

        emp.id=11;
        emp.name="Raksha";
        emp.department="IT";
        emp.profession="codeing";
        emp.salary=500;
        emp.showEmployee();
        emp.raiseSalary(500);
    }
}
