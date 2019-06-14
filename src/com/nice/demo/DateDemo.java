package com.nice.demo;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.after(new Date()));
    }
}
