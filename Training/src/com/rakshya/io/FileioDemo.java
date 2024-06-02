package com.rakshya.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileioDemo {
    //read a content of one file and copy it to another file
    public static void main(String[] args) {
        FileInputStream fis =null;
        FileOutputStream fos = null;
        String src ="C://Users//DELL//OneDrive//Desktop//abc.txt";
        String dest = "C://Users//DELL//OneDrive//Desktop//def.txt";
        try{
            fis = new FileInputStream(src);   //opens a file for read operation
            fos = new FileOutputStream(dest);  //opens a file or creates for write operation
            int data;
            while ((data = fis.read())!= -1){
                fos.write(data);
            }
        }catch (FileNotFoundException e){
            System.out.println(e);
        }catch (IOException e){
            System.out.println(e);
        }finally {
           try {
                if(fis!=null)
                    fis.close();
            }catch (IOException e){
               System.out.println(e);
           }
        }
    }
}
