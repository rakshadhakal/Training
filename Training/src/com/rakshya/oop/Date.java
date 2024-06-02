//Write a java program to create a date class represents date in year,month,day.Create a date for birthday of two
//person and compare birthdays.Also display a date in a format "mm/dd/yyyy".



package com.rakshya.oop;

import java.text.SimpleDateFormat;

public class Date {

    public int year;
    public int month;
    public int day;

    public void showDate() {
        System.out.printf("2%d/2%d/4%d\n" + month, day, year);
    }
    public boolean compareDate(Date d){
        if(month >= d.month && day >= d.day){
            return true;
        }else {
            return false;
        }
    }


    public static void main(String[] args) {
        Date dob_niru =  new Date();
        dob_niru.year=2001;
        dob_niru.month=10;
        dob_niru.day=15;

        Date dob_raksha = new Date();
        dob_raksha.year=2001;
        dob_raksha.month=12;
        dob_raksha.day=10;

        if(dob_raksha.compareDate(dob_niru)){
            //if date is greater than birthday comes later
            System.out.println("Raksha's birthday comes later than Niru's .");
        }else{
            System.out.println("Raksha's birthday comes before than Niru's.");
        }





    }
}
