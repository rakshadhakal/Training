package com.rakshya.io;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
    //retrieve object from serial from written in file
    public static void main(String[] args) {
        ObjectInputStream ois = null;
        try{
            ois = new ObjectInputStream(new FileInputStream("C://Users//DELL//OneDrive//Desktop//employee.txt"));
            Employee emp = (Employee) ois.readObject();
        }catch (Exception e){
            System.out.println("Exception: "+e.getMessage());
        }finally {
            if(ois!=null)
            try {
                ois.close();

            } catch (IOException e) {
                System.out.println("Exception: "+e.getMessage());
            }
        }
    }
}
