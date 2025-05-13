package com.dsa.collections;
import java.util.Collections;
import java.util.PriorityQueue;
public class MaxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new
                PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(1);
        maxHeap.add(21);
        maxHeap.add(11);
        maxHeap.add(31);
        maxHeap.add(10);
        System.out.println("Max Heap: " + maxHeap);
        System.out.println("Largest Element: " + maxHeap.poll());
    }
}
