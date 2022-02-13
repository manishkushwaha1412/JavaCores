package com.mythread;

public class UnderstandSynchronize {

    public static void main(String[] args) throws InterruptedException {
        NumberCounter numberCounter = new NumberCounter();
        Thread firstCounter = new Thread(()->{
            for(int i=0; i<=1000; i++){
                int value = numberCounter.addCount();
               // System.out.println("First Counter "+i+" ========>  "+value);
            }
        });

        Thread secondCounter = new Thread(()->{
            for(int i=0; i<=1000; i++){
                int value = numberCounter.addCount();
               // System.out.println("Second Counter :::::: "+i+" ==============================>  "+value);
            }
        });

        Thread thread = new Thread(firstCounter);
        Thread second = new Thread(secondCounter);
        thread.start();
       // Thread.sleep(10);
        second.start();
        thread.join();
        second.join();
        System.out.println("Total count: "+numberCounter.count);
    }
}
