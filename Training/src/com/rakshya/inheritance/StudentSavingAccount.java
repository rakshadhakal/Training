package com.rakshya.inheritance;

public class StudentSavingAccount extends SavingAccount{
    String college_name;
    public StudentSavingAccount(){
        super();   //super refers to parent class constructor
        //parent must to be initialized first before initializing
        min_balance=0;
        interest_rate=4;
    }
    public StudentSavingAccount(long acc_no, String name , double balance, double min_balance, double interest_rate, String college_name){
        super(acc_no,name,balance,min_balance,interest_rate);
        //SavingAccount(acc_no)
        this.college_name="BKC";
    }
}
