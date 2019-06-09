package com.nice.demo;

/**
 * @author ningh
 */
public class ThreadAliveDemo implements Runnable{
    public static void main(String[] args) throws InterruptedException {
        ThreadAliveDemo threadAliveDemo = new ThreadAliveDemo();
        Thread thread = new Thread(threadAliveDemo);
        thread.start();
        System.out.println(thread.isAlive());
        Thread.sleep(1000);;
      //  thread.join();
        System.out.println(thread.isAlive());
    }

    @Override
    public void run() {
//            System.out.println("---" );
    }
}
