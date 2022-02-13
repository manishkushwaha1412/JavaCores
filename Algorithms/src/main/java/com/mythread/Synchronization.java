package com.mythread;

class Counter{
    int count;
    public synchronized void  increment(){
        count++;
    }
}
public class Synchronization {

    public static void main(String[] args) throws Exception {

        Counter c = new Counter();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <=1000 ; i++) {
                    c.increment();
                }
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <=1000 ; i++) {
                    c.increment();
                }
            }
        });
        thread.start();
        thread1.start();
        thread.join();
        thread1.join();
        System.out.println(c.count);

    }

}
