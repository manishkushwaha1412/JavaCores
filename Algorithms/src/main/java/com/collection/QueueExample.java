package com.collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Queue<String> priority = new PriorityQueue<>();
        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.add("four");
        System.out.println(queue);
        System.out.println("Queue to Array::: "+queue.toArray());
        System.out.println(queue.isEmpty());
        System.out.println(queue.offer("abc"));
        queue.remove("two");
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.element());


    }
}
