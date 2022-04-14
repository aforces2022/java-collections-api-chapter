package com.zorba.collection.Map;

import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
        for (int i = 1; i < 11; i++) {
            queue.offer(i*10);
        }

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.element());
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
