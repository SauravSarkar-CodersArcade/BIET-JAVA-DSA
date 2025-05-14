package com.dsa.collections;
import java.util.PriorityQueue;
public class KLargestElements {
    public static void kLargestElements(int[] arr, int k){
        // Priority Queue is a min heap by default
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr){
            minHeap.add(num);
            if(minHeap.size() > k){
                minHeap.poll(); // Remove the smallest if size exceeds k
            }
        }
        // Print the K largest elements
        System.out.println("The " + k + " largest elements are: ");
        while (!minHeap.isEmpty()){
            System.out.print(minHeap.poll() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2,1,4,20,32,19};
        int k = 3;
        kLargestElements(arr,k);
    }
}
