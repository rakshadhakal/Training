package com.rakshya.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyDemo {
    public static void main(String[] args) {
        //finally block is used when working with resources
        FileInputStream fis=null;
        try {
            //open a file
            fis = new FileInputStream("C://Users//DELL//OneDrive//Desktop//abc.txt");
            //read from file and display
            int i;
            while ((i = fis.read()) != -1) {   //-1 is an end of stream value
                //read untill we reach the end of stream
                System.out.print((char) i);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            //close file
            try {
                if (fis != null)
                fis.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
