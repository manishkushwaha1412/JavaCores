package com.algo.test.sort;

import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.map.LRUMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class IgniteCache<K, T> {

    private final int maxSize;

    private final long timeToLeave;

    private final LRUMap<K, T> cache ;



    public IgniteCache(long timeToLeave, long timer, int maxSize){
        cache = new LRUMap<K, T>(maxSize);
        this.maxSize = maxSize;
        this.timeToLeave = timeToLeave * 1000;
        if(timeToLeave > 0 && timer >0){
            Thread thread = new Thread(()->{
                while(!Thread.currentThread().isInterrupted()){
                    try {
                        Thread.sleep(timer * 1000);
                        // logic to remove cache
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            });

        }
    }

    public void printCache(){
        cache.entrySet().stream().filter(Objects::nonNull).collect(Collectors.toList()).forEach(System.out::println);
    }
    // Logic to remove cache
    private void cleanupCache(){
        long cur = System.currentTimeMillis();
        List<K> toBeDeleted = new ArrayList<>();
        MapIterator mapIterator =  cache.mapIterator();
        while (mapIterator.hasNext()){
           Object o =  mapIterator.next();
           K key = (K) mapIterator.getKey();
           IgniteCacheObject c = (IgniteCacheObject) mapIterator.getValue();
           if(c != null){
               long exist =  c.getExistance();
               if(cur > exist + this.timeToLeave){
                   toBeDeleted.add(key);
               }
           }
        }
        toBeDeleted.forEach(this::remove);

    }

    // write get method
    public T get(K key){
        synchronized (cache){
            IgniteCacheObject igniteCacheObject = (IgniteCacheObject) cache.get(key);
            if(igniteCacheObject == null){
                return null;
            }else{
                igniteCacheObject.existance = System.currentTimeMillis();
                return igniteCacheObject.getValue();
            }
        }
    }

    // write size method

    public int size(){
        synchronized (cache){
            return cache.size();
        }
    }

    // write remove method
    public void remove(K key){
        synchronized (cache){
            cache.remove(key);
        }
    }

    // write put method
    public void put(K key, T obj){
        synchronized (cache){
            cache.put(key, (T) new IgniteCacheObject(obj));
        }
    }

    // create class
    class IgniteCacheObject{
        private T value;
        private long existance;

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public long getExistance() {
            return existance;
        }

        public void setExistance(long existance) {
            this.existance = existance;
        }

        public IgniteCacheObject(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value+"";
        }
    }

    @Override
    public String toString() {
        return "IgniteCache{" +
                "cache=" + cache +
                '}';
    }
}
