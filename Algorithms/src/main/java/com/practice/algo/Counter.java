package com.practice.algo;

public class Counter {

    public int count = 0;

    public synchronized  void counter(){
        count++;
    }
}
