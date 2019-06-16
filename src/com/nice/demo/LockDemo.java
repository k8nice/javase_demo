package com.nice.demo;

import java.util.Date;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
    public static void main(String[] args) throws InterruptedException {
        test();
        test2();
    }

    public static void test2() throws InterruptedException {
        Lock lock = new ReentrantLock();
        lock.lock();
        Condition condition =  lock.newCondition();
        condition.await();
        System.out.println(condition.awaitUntil(new Date()));
        condition.signal();
        lock.unlock();
      //  System.out.println(lock.tryLock());
    }

    public static void test(){
        Lock lock = new ReentrantLock();
        System.out.println(lock.tryLock());
    }
}
