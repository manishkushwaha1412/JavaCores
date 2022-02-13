package com.practice.algo;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MyPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
        queue.add("1");
        queue.add("5");
        queue.add("6");
        queue.add("3");
        queue.add("2");
        System.out.println("Head: "+queue.peek());
        System.out.println("Head: "+queue.element());
        System.out.println(queue);
        queue.forEach(System.out::println);
        queue.poll();
        System.out.println("");
        queue.forEach(System.out::println);
    }
}
