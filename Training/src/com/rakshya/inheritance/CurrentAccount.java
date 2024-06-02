package com.rakshya.inheritance;

public class CurrentAccount extends Account{
    double min_balance;
    String organization_name;
    public void withdraw(double amount){
        if(balance-min_balance>=amount){
            System.out.println("Amount withdrawn: "+amount);
            balance-=amount;
        }else{
            System.out.println("Withdraw failed");
        }
    }
    public void showCurrentAccount(){
       showAccountDetail();
        System.out.println("Organization: "+organization_name);
        System.out.println("Minimum Balance: "+min_balance);
    }

}
