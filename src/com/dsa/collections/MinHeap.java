package com.dsa.collections;

import java.util.PriorityQueue;
// The PriorityQueue is a min heap by default
public class MinHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(10);
        minHeap.add(1);
        minHeap.add(5);
        minHeap.add(2);
        minHeap.add(11);
        System.out.println("Min Heap: " + minHeap);
        System.out.println("Smallest Element: " + minHeap.poll());
    }
}
