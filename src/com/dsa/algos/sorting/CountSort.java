package com.dsa.algos.sorting;

import java.util.Arrays;

public class CountSort {
    static void countSort(int[] arr){
        // Find the max
        int k = arr[0];
        for (int i=1; i< arr.length; i++){
            if(arr[i] > k){
                k = arr[i];
            }
        }
        // Create the count array of 0 to max
        int[] count = new int[k+1];
        // Calculate the frequency of all the elements in the array
        for (int i=0; i< arr.length; i++){
            count[arr[i]]++;
        }
        // Calculate the cumulative count from index 1
        for(int i=1; i<=k; i++){
            // curr = curr + prev
            count[i] += count[i-1];
        }
        // Create the output array of same size as the input array
        int[] output = new int[arr.length];
        // Start from the end of the array
        for(int i= arr.length-1; i>=0; i--){
            output[--count[arr[i]]] = arr[i];
        }
        // Copy the output back to the input
        System.arraycopy(output,0,arr,0,arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {3,4,6,1,4,3,2,3,1};
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(arr));
        countSort(arr);
        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(arr));
    }
}
