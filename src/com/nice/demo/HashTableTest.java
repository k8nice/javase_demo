package com.nice.demo;

import java.util.Hashtable;
import java.util.Map;

public class HashTableTest {
    public static void main(String[] args) {
        Map map = new Hashtable();
        map.put("name",null);
        System.out.println(map.get("name"));
    }
}
