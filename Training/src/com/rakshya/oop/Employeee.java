package com.rakshya.oop;

public class Employeee {
    private String first_name;
    private String last_name;
    private double monthly_salary;

    public Employeee(String first_name, String last_name, double monthly_salary){
        this.first_name = first_name;
        this.last_name = last_name;
        this.monthly_salary= monthly_salary;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

   public double getMonthly_salary(){
        return monthly_salary;
   }

   public void setMonthly_salary(double monthly_salary){
        this.monthly_salary=monthly_salary;
   }

    public double getYearlySalary(){
        return monthly_salary*12;
    }

    public void applyRaise(double percentage){
        monthly_salary=(1+percentage/100);
    }
}
