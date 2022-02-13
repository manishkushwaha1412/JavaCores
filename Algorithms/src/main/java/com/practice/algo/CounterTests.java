package com.practice.algo;

public class CounterTests {

    public static void main(String[] args) throws InterruptedException {

        // create counter object and call counter by two thread
        Counter counter = new Counter();

        Thread t1 = new Thread(()->{
            for (int i = 0; i < 1000 ; i++) {
                counter.counter();
            }
        });
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 1000 ; i++) {
                counter.counter();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(" Finished and counter is "+ counter.count);
    }
}
