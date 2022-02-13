package com.algo.test.sort;

public class IgniteTest {
    public static void main(String[] args) {
        IgniteCache<String, String> igniteCache = new IgniteCache<String, String>(50, 60, 5);
        for (int i = 0; i < 6 ; i++) {
            igniteCache.put("Key"+i, "Value"+i);
        }
        System.out.println("Size after adding objects : "+igniteCache.size());
        igniteCache.printCache();
        igniteCache.put("A", "A");
        System.out.println("Size after adding objects : "+igniteCache.size());
        igniteCache.printCache();
    }
}
