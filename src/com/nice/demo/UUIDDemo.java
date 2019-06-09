package com.nice.demo;

import java.util.Date;
import java.util.Timer;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @author ningh
 */
public class UUIDDemo {

    public static void main(String[] args) {
        UUID uuid = new UUID(1,5);
        System.out.println(uuid.version());
    }

}
