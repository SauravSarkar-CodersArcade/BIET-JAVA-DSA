package com.dsa.algos.sorting;
import java.util.Arrays;
public class MergeSort {
    public static void mergeSort(int[] arr){
        if(arr.length < 2){
            return;
        }
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr,0,mid);
        int[] right = Arrays.copyOfRange(arr,mid,arr.length);
        mergeSort(left); // Recursive split for left part of the array
        mergeSort(right); // Recursive split for right part of the array
        merge(arr,left,right);
    }
    public static void merge(int[] arr, int[] left, int[] right){
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length){
            if(left[i] < right[j]){
                arr[k++] = left[i++];
            }else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length){
            arr[k++] = left[i++];
        }
        while (j < right.length){
            arr[k++] = right[j++];
        }
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,0,-2,2,4,9,11,3,6,8,-4,11,45,300};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
