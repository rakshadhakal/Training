package com.rakshya.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertOp {
    // Step-by-step database insert operation using statement
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //Step1:Load database driver class
        Class.forName("com.mysql.cj.jdbc.Driver");
         //Step2:Create Connection Object
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/company_db","root","");
        //Step3:Create a Statement Object
        Statement stmt = conn.createStatement();
        //create empty statement i.e without any sql query

        //step4:Writer sql query
        String sql ="insert into employee_table(name,address,salary)"+"values('Raksha','Dhankuta',1400)";

        //step5:execute query using statement
        int i = stmt.executeUpdate(sql);
        if(i==1){
            System.out.println("One employee record added!");
        }else{
            System.out.println("No record added");
        }
        //step6:Close resources (connection and statement)
        conn.close();
        stmt.close();
    }
}
