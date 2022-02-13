package com.mythread;

public class ThreadTest {

    public static void main(String[] args) throws InterruptedException {

        FirstThread firstThread = new FirstThread("Hello");
        FirstThread secondThread = new FirstThread("Hi");
        //firstThread.start();
       // firstThread.join();
        //Thread.sleep(10);
        //secondThread.start();

        // Above one is the one way to create thread another way is down
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 10; i++) {
                    System.out.println("First");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 10; i++) {
                    System.out.println("Second");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread thread = new Thread(()->{
            for (int i = 0; i <= 10; i++) {
                System.out.println("First");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread1 = new Thread(()->{
            for (int i = 0; i <= 10; i++) {
                System.out.println("Second");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        Thread.sleep(10);
        thread1.start();
        thread.join();
        thread1.join();
        System.out.println("Completed");

    }


}
