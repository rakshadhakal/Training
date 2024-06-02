package com.rakshya.inheritance;

public class Account {
    public long acc_no;
    public String name;
    public double balance;
    public static String bank;

     double min_balance=0;

    public Account(){

    }

    public Account(long acc_no, String name, double balance){
        this.acc_no=acc_no;
        this.name=name;
        this.balance=balance;
    }

    public void deposite(double amount){
        balance+=amount;
        System.out.println("Amount deposited"+amount);
    }

    public void withdraw(double amount){
        balance -= amount;
        System.out.println("Amount withdrawn"+amount);
        System.out.println("Your remaining balance is"+balance);
    }
    public void showAccountDetail(){
        System.out.println("***************Welcome************************");
        System.out.println("Account no: "+acc_no);
        System.out.println("Name: "+name);
        System.out.println("Balance: "+balance);
    }

}
