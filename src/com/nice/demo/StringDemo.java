package com.nice.demo;

public class StringDemo {
    public static void main(String[] args) {
//        String str = "刘二同学";
//        System.out.println(str.substring(0,2));
        String str = "nice";
        String str1 = new String("nice").intern();
//        System.out.println(str == str1);
//        System.out.println(str.indexOf("s"));
//        System.out.println(str.indexOf("n"));
//        System.out.println(str.chars().max().getAsInt());
//        System.out.println('n'+0);
        System.out.println(str.contains("n"));
    }
}
