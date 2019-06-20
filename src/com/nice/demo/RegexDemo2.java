package com.nice.demo;

/**
 * @author ningh
 */
public class RegexDemo2 {
    public static void main(String[] args) {
//        functionDemo_1();
//        functionDemo_2();
//        functionDemo_3();
//        functionDemo_4();
//        functionDemo_5();
        functionDemo_6();

    }

    public static void functionDemo_5() {
        String str = "zhangsanttttttxiaoqiangmmmmmmzhaoliu";
        str = str.replaceAll("(.)\\1+","#");
        System.out.println(str);
    }

    public static void functionDemo_6() {
        String str = "zhangsanttttttxiaoqiangmmmmmmzhaoliu";
        str = str.replaceAll("(.)\\1+","$1");
        System.out.println(str);
    }


    public static void functionDemo_2(){
        String str = "zhangsan   xiaoqiang      zhaoliu";
        String[] names = str.split(" +");
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void functionDemo_3(){
        String str = "zhangsan.xiaoqiang.zhaoliu";
        String[] names = str.split("\\.");
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void functionDemo_4(){
        String str = "zhangsanttttttxiaoqiangmmmmmmzhaoliu";
        String[] names = str.split("(.)\\1+");
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void functionDemo_1(){
        String tel = "15800001111";
        String regex = "1[358]\\d{9}";
        boolean b = tel.matches(regex);
        System.out.println(tel + ":" + b);
    }
}
