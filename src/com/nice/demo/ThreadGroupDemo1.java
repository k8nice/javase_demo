package com.nice.demo;

/**
 * @author ningh
 */
public class ThreadGroupDemo1 {
    public static void main(String[] args) {
        //获取当前线程的group
        ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();
        //在当前线程执行流中新建一个Group1
        ThreadGroup group1 = new ThreadGroup("Group1");
        //Group1的父线程，就是main线程所在Group
        System.out.println(group1.getParent() == currentGroup);
        //定义Group2，指定group1为其父线程
        ThreadGroup group2 = new ThreadGroup(group1,"Group2");
        System.out.println(group2.getParent() == group1);
    }
}
