package com.rakshya.MultiThreading;

public class ThreadByExtends extends Thread{
    //we add a code to run as a new thread inside a run() method

    @Override
    public void run(){
        System.out.println("Currrent Thread: "+ currentThread().getName());
        //counts from 1 to 10
        for (int i=1; i<=10; i++){
            System.out.println(i);
            try {
                sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Exception: "+e.getMessage());
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread: "+Thread.currentThread().getName());
        //shows the name of thread that run main method
        ThreadByExtends t1= new ThreadByExtends();
        t1.setName("Counting thread 1");
        t1.start(); //starts new thread by executing run() method
        t1.join();
        ThreadByExtends t2 = new ThreadByExtends();
        t2.setName("Counting thread 2");
        t2.start();
        System.out.println("Main ends.");
    }
}
