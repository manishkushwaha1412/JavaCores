package com.mythread;

import java.util.concurrent.BlockingQueue;

public class ThreadMessageConsumer implements Runnable {

    private BlockingQueue<ThreadMessage> queue;

    public ThreadMessageConsumer(BlockingQueue<ThreadMessage> queue) {
        this.queue = queue;
    }


    @Override
    public void run() {
        try{
            ThreadMessage message;
            while(!(message = queue.take()).getMessage().equalsIgnoreCase("exist")){
                Thread.sleep(10);
                System.out.println("Message : "+message.getMessage()+" has been consumed");
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
