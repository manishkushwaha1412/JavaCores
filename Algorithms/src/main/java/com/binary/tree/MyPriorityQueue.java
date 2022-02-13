package com.binary.tree;

import java.util.Collections;
import java.util.PriorityQueue;

public class MyPriorityQueue {

    public static void main(String[] args) {
        int[] array = {20, 10, 60, 30, 50, 40};
        int k = 3;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < 3 ; i++) {
            queue.add(array[i]);
        }
        System.out.println(queue);
        for (int i = k; i < array.length ; i++) {
            if(queue.peek() < array[i]){
                queue.poll();
                queue.add(array[i]);
            }
        }
        System.out.println(queue);
        System.out.println(queue.peek());

    }
}
