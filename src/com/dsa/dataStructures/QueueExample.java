package com.dsa.dataStructures;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
public class QueueExample {
    public static void main(String[] args) {
        // Queue is an interface, so we create object
        // of LinkedList which implements the Queue
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(100);
        queue.offer(101);
        queue.offer(102);
        System.out.println("Queue: " + queue);
        queue.poll(); // Removes the front element
        System.out.println("Front element: " + queue.peek());
        System.out.println("After poll: " + queue);
        // Queue<Integer> queue1 = new PriorityQueue<>();
    }
}
