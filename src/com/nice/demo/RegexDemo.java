package com.nice.demo;

public class RegexDemo {

    public static void main(String[] args) {

        String qq = "123456";
        String regex = "[1-9][0-9]{4,14}";
//        boolean b = qq.matches(regex);
//        System.out.println(qq+":"+b);

        String str = "aoooooob";
//        String str = "aob";
//        String reg = "aob";
//        String reg = "ao+b";
        String reg = "ao{4,}b";
        boolean b = str.matches(reg);
        System.out.println(str + ":" + b);

    }

}
