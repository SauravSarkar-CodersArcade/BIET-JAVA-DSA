package com.problems;
public class FirstLastTotalBinarySearch {
    public static int firstOccurrence(int[] arr, int key){
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == key){
                ans = mid;
                // Go to the extreme left to find the first occurrence
                e = mid - 1;
            } else if (arr[mid] < key) {
                s = mid + 1;
            }else {
                e = mid - 1;
            }
        }
        return ans;
    }
    public static int lastOccurrence(int[] arr, int key){
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == key){
                ans = mid;
                // Go to the extreme right to find the last occurrence
                s = mid + 1;
            } else if (arr[mid] < key) {
                s = mid + 1;
            }else {
                e = mid - 1;
            }
        }
        return ans;
    }
    public static int totalOccurrence(int[] arr, int key){
        int fo = firstOccurrence(arr,key);
        int lo = lastOccurrence(arr,key);
        int total = lo - fo + 1;
        return total;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,4,5};
        System.out.println("First: " + firstOccurrence(arr,3));
        System.out.println("Last: " + lastOccurrence(arr,3));
        System.out.println("Total: " + totalOccurrence(arr,3));
    }
}
