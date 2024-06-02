package com.rakshya.oop;

public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    public  SavingsAccount(double initialBalance){
        this.savingsBalance=initialBalance;
    }

    public void calculateMonthlyInterest(){
        double monthlyInterest=savingsBalance*(annualInterestRate/12);
        System.out.println("Your monthly interest is "+monthlyInterest);
        savingsBalance=savingsBalance+monthlyInterest;
    }

    public static void modifyInterestRate(double newInterestRate){
        annualInterestRate=newInterestRate;
    }

    public double getSavingsBalance(){
        return savingsBalance;
    }

    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount(2000.00);
        SavingsAccount.modifyInterestRate(0.04);
        s1.calculateMonthlyInterest();
        System.out.println("Month 1 -Saver1 balance: $"+s1.getSavingsBalance());
        SavingsAccount.modifyInterestRate(0.05);
        s1.calculateMonthlyInterest();
        System.out.println("Month 2 -Saver1 balance: $"+s1.getSavingsBalance());
        System.out.println("------Savings Balance for s1: "+s1.savingsBalance +"--------------");
    }
}
