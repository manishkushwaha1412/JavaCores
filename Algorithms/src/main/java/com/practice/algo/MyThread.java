package com.practice.algo;

public class MyThread {

    public static void main(String[] args) throws InterruptedException {
        MyT myT = new MyT("1");
        MyT myT2 = new MyT("2");
        Thread t1 = new Thread(myT);
        Thread t2 = new Thread(myT2);
        t1.start();
        Thread.sleep(30);
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Completed");

    }

}

class MyT extends Thread{
    public String message ;
    public MyT(String message){
        this.message = message;
    }

    @Override
    public void run(){
        for (int i = 0; i <5 ; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.message);
        }
    }
}
