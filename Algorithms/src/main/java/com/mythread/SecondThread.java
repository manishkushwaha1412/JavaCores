package com.mythread;

public class SecondThread implements Runnable{

    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println("Thread: No "+i);
        }
    }
}
