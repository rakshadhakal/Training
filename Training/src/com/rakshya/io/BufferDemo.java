package com.rakshya.io;

import java.io.*;

public class BufferDemo {
    //Buffered technique allows us to read and write data in bulk
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader("C://Users//DELL//OneDrive//Desktop//abc.txt"));
            bw = new BufferedWriter(new FileWriter("C://Users//DELL//OneDrive//Desktop//buf.txt", true));
            String line = br.readLine();
            while (line != null) {
                bw.write(line);
                line = br.readLine();
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            try{
            if (br != null) br.close();
            if (bw != null) bw.close();
        }catch(Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
        }
    }
}
