package com.mythread;

public class NumberCounter {

    int count = 0;
    public synchronized int addCount(){

        return count++;
    }
}
