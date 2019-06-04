package com.nice.demo;

import java.util.Calendar;

public class YesterdayCurrent {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE,-1);
        System.out.println(cal.getTime());
    }
}
