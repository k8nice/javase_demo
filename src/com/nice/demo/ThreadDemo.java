package com.nice.demo;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

class ThreadTest implements Runnable{

    private Integer i = 5;

    @Override
    public  void run() {
        for (int j = 0; j < i; j++) {
            System.out.println(j);
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        ThreadTest tt = new ThreadTest();

      //  executorService.submit(tt);
//        Thread r1 = new Thread(tt);
//        Thread r2 = new Thread(tt);
//        r1.start();
//        r2.start();

    }
}
