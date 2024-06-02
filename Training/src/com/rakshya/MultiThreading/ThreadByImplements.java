package com.rakshya.MultiThreading;

public class ThreadByImplements implements Runnable{
    //This class object is only a runnable object, not entirely a thread object
    @Override
    public void run() {
        System.out.println("Currrent Thread: "+Thread.currentThread().getName());
        //counts from 1 to 10
        for (int i=1; i<=10; i++){
            System.out.println(i);
            try {
               Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Exception: "+e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        ThreadByImplements tr = new ThreadByImplements();
        Thread t1 = new Thread(tr);
        //The runnable object tr is passed as an arguments to create a new thread t1
        t1.setPriority(1);   //MIN_PRIORITY

        Thread t2 = new Thread(tr);
        t2.setPriority(Thread.MAX_PRIORITY);  //10

        t1.start();
        t2.start();
    }
}
