package com.nice.demo;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author ningh
 */
public class ConcurrentHashMapDemo {

    public static void main(String[] args) {
        Map map = new ConcurrentHashMap();
        map.put(1,"nice");
        System.out.println(map.get(1));
    }

}
