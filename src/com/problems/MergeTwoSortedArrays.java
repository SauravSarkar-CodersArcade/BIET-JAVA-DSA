package com.problems;
import java.util.Arrays;
public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a1 = {1,3,5,7,9};
        int[] a2 = {2,4,6};
        int[] mergedArray = mergeTwoSortedArrays(a1,a2);
        System.out.println(Arrays.toString(mergedArray));
    }
    public static int[] mergeTwoSortedArrays(int[] arr1,
                                             int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] merged = new int[n1+n2];
        int i=0, j=0, k=0;
        while (i<n1 && j < n2){
            if(arr1[i] < arr2[j]){
                merged[k++] = arr1[i++];
            }else {
                merged[k++] = arr2[j++];
            }
        }
        // Copy remaining parts from 1st & 2nd if any
        while (i < n1){
            merged[k++] = arr1[i++];
        }
        while (j < n2){
            merged[k++] = arr2[j++];
        }
        return merged;
    }
}
