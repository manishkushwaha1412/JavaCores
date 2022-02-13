package com.mythread;

public class FirstThread extends Thread {
    private String name;
    FirstThread(String name){
        this.name = name;
    }

    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(name);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
