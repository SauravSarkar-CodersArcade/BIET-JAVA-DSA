package com.dsa.algos.searching;
public class RecursiveBinarySearch {
    public static int recursiveBinarySearch(int[] arr, int s, int e, int key){
        if( s > e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if(arr[mid] == key){
            return mid;
        } else if (arr[mid] < key) {
            return recursiveBinarySearch
                    (arr,mid+1, e, key); // start changes
        }else {
            return recursiveBinarySearch(arr,s,mid-1,key); // end changes
        }
    }

    public static void main(String[] args) {
        int[] sortedArray = {10,12,23,46,57,89};
        System.out.println(
                recursiveBinarySearch(sortedArray,0,
                        sortedArray.length-1,12));
    }
}
