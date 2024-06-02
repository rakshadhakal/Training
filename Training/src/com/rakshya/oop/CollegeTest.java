package com.rakshya.oop;

public class CollegeTest {
    public static void main(String[] args) {
        College c1 = new College();
        College c2 = new College();
        College.university = "TU";
        c1.code= 23423;
        c2.code =34454 ;
        c1.name = "bkc";
        c2.name = "lordbuddha";
        c1.address = "Biratnagar";
        c2.address = "Itahari";

        c1.showCollege();
        c2.showCollege();

    }
}
