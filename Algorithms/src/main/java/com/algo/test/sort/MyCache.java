package com.algo.test.sort;

import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class MyCache<K, T> {

    private final long ttl ;
    private final int maxSize;
    // Take one sortreference type of object in concurrent hash map
    private final ConcurrentMap<K, SoftReference<T>> cache = new ConcurrentHashMap<>();


    public MyCache(long timeToLive, int maxSize){
        this.ttl = timeToLive;
        this.maxSize = maxSize;
        if(timeToLive > 0){
            Thread thread = new Thread(()->{
               while(!Thread.currentThread().isInterrupted()){
                   try {
                       Thread.sleep(timeToLive * 1000);
                       // Logic to remove object from cache
                       removeObjectFromCache(cache);
                   }catch(InterruptedException e){
                       e.printStackTrace();
                   }
               }
            });
        }
    }

    // write a logic to remove data from the map
    private void removeObjectFromCache(ConcurrentMap<K, SoftReference<T>> cache){
        cache.entrySet()
                .removeIf(o-> Optional.ofNullable(o.getValue()).map(d->(MyCustomCache)d.get()).map(MyCustomCache::isExpiry).orElse(false));
    }

    // write get method
    public T get(K key){
        return (T) Optional.ofNullable(cache.get(key)).map(d->(MyCustomCache) d.get()).map(MyCustomCache::getValue).orElse(null);
    }

    // write remove mothod

    public void remove(K key){
        cache.remove(key);
    }

    // write size  method
    public int size(){
        return cache.size();
    }

    public void put(K key, T obj){
        if(key == null ) return ;
        if(obj == null){
            remove(key);
        }else{
            long current = System.currentTimeMillis();
            cache.put(key, new SoftReference(new MyCustomCache<>(obj, current)));
        }
    }

    // create static class for custom object
    private static class MyCustomCache<T>{
        private T value;
        private long validity;

       protected boolean isExpiry(){
            return System.currentTimeMillis() > validity;
        }

        public MyCustomCache(T value) {
            this.value = value;
        }

        public MyCustomCache(T value, long validity) {
            this.value = value;
            this.validity = validity;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public long getValidity() {
            return validity;
        }

        public void setValidity(long validity) {
            this.validity = validity;
        }
    }



}
