package com.nice.demo;

public class ThreadInterruptedDemo {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(){
            @Override
            public void run(){
               // System.out.println("nice");
                System.out.println(System.currentTimeMillis());
                System.out.println(Thread.currentThread().getName());
                while (true){

                }
            }
        };
        thread.setName("nice");
        thread.start();
     //   Thread.sleep(5000);
        thread.interrupt();
   //     thread.join();
        thread.interrupt();
        System.out.println(thread.isInterrupted());
    }

}
