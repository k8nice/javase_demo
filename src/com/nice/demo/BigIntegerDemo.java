package com.nice.demo;

import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("180000");
        System.out.println(bigInteger.intValue()/100);
    }
}
