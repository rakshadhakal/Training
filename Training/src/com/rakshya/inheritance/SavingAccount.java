package com.rakshya.inheritance;

public class SavingAccount extends Account{
    double min_balance;
    double interest_rate;

    public SavingAccount(){
        super();
        min_balance=500;
        interest_rate=7;
    }
    public SavingAccount(long acc_no, String name , double balance, double min_balance, double interest_rate){
        super(acc_no,name,balance);
        this.min_balance=min_balance;
        this.interest_rate=interest_rate;
    }

    public void displaySavingsAccount(){
        showAccountDetail();
        System.out.println("Annual Interest rate: "+interest_rate);

    }
    @Override
    public void withdraw(double amount){
      //override is to redefine a parent method to work differently
      //with child class object
      if(balance - min_balance >=amount) { //fund sufficient
          balance -= amount;
          System.out.println("Amount withdrawn: " + amount);
          System.out.println("Remaining balance: " + balance);
      }else{
          System.out.println("Insufficient withdrawable balance: "+(balance-min_balance));
      }
    }

    public static void main(String[] args) {
        Account acc= new Account();
        acc.acc_no=123445576;
        acc.name="Raksha Dhakal";
        acc.deposite(2000);
        acc.withdraw(3000);
        acc.showAccountDetail();

        SavingAccount sa = new SavingAccount();
        sa.acc_no=1234567890;
        sa.name="Asther Sundas";
        sa.min_balance=500;
        sa.interest_rate=5.00;
        sa.deposite(2000);
        sa.withdraw(1000);
        sa.withdraw(1000);   //not allowed
        sa.withdraw(500);    //allowed

    }
}
