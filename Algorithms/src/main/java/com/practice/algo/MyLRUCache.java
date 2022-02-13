package com.practice.algo;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class MyLRUCache {

    static Deque<Integer> queue = new LinkedList<>();
    static Map<Integer, Cache> map = new HashMap<>();
    int CACHE_CAPACITY = 4;

    public static void main(String[] args) {
        MyLRUCache myLRUCache = new MyLRUCache();
        myLRUCache.put(1, "One");
        myLRUCache.put(2, "Two");
        myLRUCache.put(3, "Three");
        myLRUCache.put(4, "Four");
        System.out.println(queue);
        System.out.println(myLRUCache.get(2));
        System.out.println("");
        System.out.println(queue);
        System.out.println(myLRUCache.get(4));
        System.out.println(queue);
    }

    // get value from the cache
    public String get(int key){
        if(map.containsKey(key)){
            Cache current =  map.get(key);
            queue.remove(current.key);
            queue.addFirst(current.key);
            return current.value;
        }
        return "Not Found";
    }

    // put element in the key
    public void put(int key, String value){
        if(map.containsKey(key)){
            Cache current =  map.get(key);
            queue.remove(current.key);
        }else{
            if(map.size() == CACHE_CAPACITY){
               int temp = queue.removeLast();
               map.remove(temp);
            }
            // insert now here
            Cache cache = new Cache(key, value);
            queue.addFirst(cache.key);
            map.put(key, cache);
        }
    }
}


class Cache{
    int key;
    String value;

    public Cache(int key, String value){
        this.key = key;
        this.value = value;
    }

}
