package com.mythread;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class ThreadMessageProducer implements Runnable {
   private BlockingQueue<ThreadMessage> queue ;

   public ThreadMessageProducer(BlockingQueue<ThreadMessage> threadMessages){
       this.queue = threadMessages;
   }


    @Override
    public void run() {
        for (int i = 0; i < 5 ; i++) {
            ThreadMessage threadMessage = new ThreadMessage("Hello Here : "+i);
            try{
                Thread.sleep(10);
                queue.put(threadMessage);
                System.out.println("Message :: "+threadMessage.getMessage()+" has been Produced");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
