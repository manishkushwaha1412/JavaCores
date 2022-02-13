package com.mythread;

public class ThreatTest {

    public static void main(String[] args) throws Exception{
        Thread thread = new Thread(() -> {
            for (int i = 0; i <=5 ; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                } ;
            }
        });
        Thread thread1 = new Thread(()->{
            for (int i = 0; i <=5 ; i++) {
                System.out.println("Hello");
                try{Thread.sleep(500);}catch (Exception e){};
            }
        });
        thread.start();
        try{Thread.sleep(10);}catch (Exception e){};
        thread1.start();
        thread.join();
        thread1.join();
        System.out.println("Done");
    }

}
