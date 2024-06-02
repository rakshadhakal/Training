package com.rakshya.io;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriterDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //take console input and save information in a csv file
        System.out.println("Enter employee detail: ");
        PrintWriter pw= null;
        try {
            pw = new PrintWriter(new FileWriter("C://Users//DELL//OneDrive//Desktop//employee.csv", true));
            Employee emp = new Employee();
            System.out.println("Enter employee id: ");
            emp.setId(sc.nextInt());
            System.out.println("Enter employee name: ");
            sc.nextLine();
            emp.setName(sc.nextLine());
            System.out.println("Enter Employee position");
            emp.setPosition(sc.nextLine());
            System.out.println("Enter Employee salary: ");
            emp.setSalary(sc.nextDouble());
            pw.println(emp.toString());
        }catch (IOException e){
            System.out.println("Exception: "+e.getMessage());
        }finally {
            if (pw!=null)
                pw.close();
        }
    }
}
