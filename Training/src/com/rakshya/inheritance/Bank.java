package com.rakshya.inheritance;

public class Bank {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount(12345654,"Raksha Dhakal", 12090, 1000, 6);
        Account.bank="SBL";
        sa.deposite(2000);
        sa.withdraw(5000);
        sa.displaySavingsAccount();

        CurrentAccount ca = new CurrentAccount();
        ca.acc_no=12343543;
        ca.name="Raksha";
        ca.balance=120000;
        ca.min_balance=5000;
        ca.organization_name="BKC";
        ca.deposite(1000);
        ca.withdraw(5000);
        ca.showCurrentAccount();

        Account ac = sa;   //savings account object placed upon Account reference
        ac.withdraw(5000);
        //though the reference variable is of Account (super) as is used to call
        //withdraw() method, it is used object of SavingAccount(Subclass) at Runtime to decide which method to call .IT actually calls withdraw() from SavingsAccount class.
        //Hence, Object reference is used to invoke methods during runtime : runtime-polymorphism

        ac=ca;
        ac.withdraw(5000);
        //ac of Account used to invoke method withdraw(),but the method used actually is
        //according to object reference which is ca of CurrentAccount,hence method used
        //is also from currentAccount Class

        Account.bank="ABC";
        CurrentAccount.bank="CBA";
        ca.showAccountDetail();    //CAB
        ac.showAccountDetail();     //CAB

        System.out.println("Min balance of ac: "+ac.min_balance);
        System.out.println("Min balance of ca: "+ca.min_balance);
        //when accessing variables that have same name in both parent and child class
        //the child class variable hides parent class variable inside child class and the
        //variable used depends upon a class reference used



    }
}
