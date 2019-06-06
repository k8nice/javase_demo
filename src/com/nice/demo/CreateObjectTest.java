package com.nice.demo;

import java.io.*;
import java.util.Date;

/**
 * 实例化的几种方式
 * @author ningh
 */
public class CreateObjectTest {

    public static void main(String[] args) {
        //工厂设计模式
       // String str = String.valueOf("nice");
       // System.out.println(str);
//       Person p1 = new Person();
////       p1.setName("nice");
////       p1.setAge(18);
////        try {
////            Person p3 = (Person) p1.clone();
////            System.out.println(p3.getAge());
////            System.out.println(p3.getName());
////        } catch (CloneNotSupportedException e) {
////            e.printStackTrace();
////        }
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("d:/obj.txt"));
            Date date = new Date();
            out.writeObject(date);
            out.close();
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("d:/obj.txt"));
            Date date1 = (Date) in.readObject();
            System.out.println(date1);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
