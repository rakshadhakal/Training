package com.rakshya.io;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    //ObjectOutputStrem is used to serialize object and
    //write that object into a file
    public static void main(String[] args) {
        ObjectOutputStream oos = null;
        try{
            oos= new ObjectOutputStream(new FileOutputStream("C://Users//DELL//OneDrive//Desktop//employee.txt"));
           Employee emp = new Employee(1,"Raksha Dhakal","Manager",12000);
           oos.writeObject(emp);

        }catch (IIOException e){
            System.out.println("Exception: "+e.getMessage());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try{
               if(oos!=null)
                   oos.close();
            }catch (IOException e){
                System.out.println("Exception: "+e.getMessage());
            }
        }
    }
}
