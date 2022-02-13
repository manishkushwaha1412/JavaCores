package com.mythread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ThreadMessageTest {

    public static void main(String[] args) {
        BlockingQueue<ThreadMessage> crunchQueue = new ArrayBlockingQueue<>(10);
        ThreadMessageProducer crunchProducer = new ThreadMessageProducer(crunchQueue);
        ThreadMessageConsumer crunchConsumer = new ThreadMessageConsumer(crunchQueue);

        // starting producer to produce messages in queue
        new Thread(crunchProducer).start();

        // starting consumer to consume messages from queue
        new Thread(crunchConsumer).start();
    }
}
