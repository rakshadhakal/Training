package com.rakshya.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ScannerDemo {
    //read csv file and assign the value to individual fields of object
    public static void main(String[] args) throws FileNotFoundException {
        Employee emp = new Employee();
        try(Scanner sc = new Scanner(new FileReader("C://Users//DELL//OneDrive//Desktop//employee.csv"))){
  String line;
            while (sc.hasNextLine()){
                line=sc.nextLine();
              // System.out.println(line);
                line = line.substring(0,line.length()-1);
              //  System.out.println(line);
                String [] parts = line.split(", ");
                emp.setId(Integer.parseInt(parts[0]));
                emp.setName(parts[1]);
                emp.setPosition(parts[2]);
                emp.setSalary(Double.parseDouble(parts[3]));
                //display employee object
                System.out.println(emp.toString());
            }
        }
    }
}
