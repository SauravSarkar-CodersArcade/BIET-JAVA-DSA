package com.dsa.collections;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
public class KthSmallestInArray {
    public static int kthSmallestElement(int[] arr, int k){
        // We use the reverse order to create a max heap
        PriorityQueue<Integer> maxheap = new
                PriorityQueue<>(Collections.reverseOrder());
        for(int num : arr){
            maxheap.add(num);
            if(maxheap.size() > k){
                maxheap.poll(); // Remove the largest to maintain k size
            }
        }
        return maxheap.peek(); // The top element will be the kth smallest
    }

    public static void main(String[] args) {
        int[] arr = {7,10,4,3,20,15};
        int k = 3;
        int ans = kthSmallestElement(arr,k);
        System.out.println("The " + k + "rd smallest element in the array "
        + Arrays.toString(arr) + " is " + ans);
    }
}
