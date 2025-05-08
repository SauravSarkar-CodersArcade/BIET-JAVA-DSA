package com.dsa.algos.searching;
public class BinarySearch {
    public static int binarySearch(int[] arr, int key){
        int s = 0;
        int e = arr.length - 1;
        while (s <= e){
            int mid = s+(e-s)/2;
            if(arr[mid] == key){
                return mid; // Element is found, so return index=mid
            } else if (arr[mid] < key) {
                s = mid + 1; // Go to the right hand side
            }else {
                e = mid - 1; // Go to the left hand side
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] sortedArray = {10,12,23,46,57,89};
        System.out.println(binarySearch(sortedArray,23));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE + 1);
        System.out.println(Integer.MIN_VALUE - 1);
    }
}
