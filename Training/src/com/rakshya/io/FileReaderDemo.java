package com.rakshya.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        FileReader fr =null;
        FileWriter fw = null;
        try{
            fr = new FileReader("C://Users//DELL//OneDrive//Desktop//abc.txt");
            fw = new FileWriter("C://Users//DELL//OneDrive//Desktop//pqr.txt",true);
            char[] ch = new char[1024];
            while(fr.read(ch,0,1024)!=-1){   //-1 is End of stream value
                fw.write(ch);
            }
            fw.write("\r\n");
        }catch (Exception e){
            System.out.println("Exception occurs: "+e.getMessage());
        }finally {
            try {
                if(fr!= null) fr.close();
                if(fw!=null) fw.close();
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
