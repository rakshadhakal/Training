package com.rakshya.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("C://Users//DELL//OneDrive//Desktop//abc.txt");
        if(file.exists()){
            System.out.println("File does exists..");
            System.out.println("File Name: "+file.getName());
            System.out.println("Path: "+file.getAbsolutePath());
            System.out.println("File Size(Bytes) :"+file.length());
            System.out.println("Disk Size: "+file.getTotalSpace());
            System.out.println("Free Disk Space: "+file.getFreeSpace());
            System.out.println("Is Readonly: "+file.canRead());
            System.out.println("Is Writeable: "+file.canWrite());
            System.out.println("Is executable: "+file.canExecute());
        }else{
            file.createNewFile();
        }
        //Directory representation
        File dir = new File("C://Users//DELL//OneDrive//Desktop//Uml Diagrams");
        if(dir.exists()&& dir.isDirectory()){
            System.out.println("Directory Exists: "+dir.getName());
            String [] files = dir.list();
            assert files !=null;
            for (String filenames: files){
                System.out.println(filenames);
            }
        }else {
            dir.mkdir();
        }
    }
}
