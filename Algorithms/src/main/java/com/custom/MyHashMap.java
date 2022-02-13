package com.custom;

import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class MyHashMap {

    public static void main(String[] args) throws Exception {
        Map<String, String> hashMap = new HashMap<>();
        long start = System.currentTimeMillis();
       /* for(int i=0; i<=10000000; i++){
            hashMap.put("key"+i, "value"+i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time Elapsed - "+(end-start));
        System.out.println(hashMap.containsValue("value1000001"));
        long end2 = System.currentTimeMillis();
        System.out.println("Search Time - "+(end2-end));*/
        Set<String> lists = new HashSet<>();
        for(int i=0; i<=10000000; i++){
            lists.add("key"+i);
        }
        long end3 = System.currentTimeMillis();
        System.out.println(lists.contains("key1000001"));
        long end4 = System.currentTimeMillis();
        System.out.println("Search Time in List "+(end4-end3));
    }
}
