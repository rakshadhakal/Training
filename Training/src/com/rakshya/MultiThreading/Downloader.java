package com.rakshya.MultiThreading;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.IOException;
import java.net.URLConnection;
import java.sql.Connection;

public class Downloader implements Runnable{
    @Override
    public void run(){
        //this thread runs a file or program from the internet
        BufferedInputStream bis =null;
        BufferedOutputStream bos = null;
       try{
           URL url = new URL("https://www.cs.cmu.edu/afs/cs.cmu.edu/user/gchen/www/download/java/LearnJava.pdf");
           System.out.println("File name: "+url.getFile());
           URLConnection connection = url.openConnection();
           connection.getInputStream();
           bis = new BufferedInputStream(connection.getInputStream());
           bos=new BufferedOutputStream(new FileOutputStream("C://Users//DELL//OneDrive//Desktop//"+"LearnJava.pdf"));
           byte[] data = new byte[1024];
           int count=0;
           while (bis.read(data,0,1024)!= -1){
               bos.write(data,0,1024);
               System.out.println("Downloaded Kb: "+ ++count);
           }
       } catch (Exception e) {
           throw new RuntimeException(e);
       } finally {
           try{
               if (bis!=null) bis.close();
               if(bos!=null) bos.close();
           }catch (IOException e){
               System.out.println(e);
           }
       }
    }

    public static void main(String[] args) {
        Downloader download = new Downloader();
        Thread t1 = new Thread(download);
        t1.start();
    }
}
