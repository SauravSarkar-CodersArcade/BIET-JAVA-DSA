package com.dsa.algos.searching;
public class JumpSearch {
    public static int jumpSearch(int[] arr, int x){
        int n = arr.length;
        int step = (int)Math.floor(Math.sqrt(n)); // Decimal
        int prev = 0;
        // Jump in blocks until we find a block where
        // we find x
        while (arr[Math.min(step,n)-1] < x){
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if(prev >= n){
                // x is not found
                return -1;
            }
        }
        // Do a linear search in the block where x may be
        while (arr[prev] < x){
            prev++;
            if(prev == Math.min(step,n)){
                return -1; // x not found
            }
        }
        // If we found x
        if(arr[prev] == x){
            return prev;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr =
                {0,1,1,2,3,5,8,13,21,34,55,89,144,233,
                377,610};
        System.out.println(jumpSearch(arr,233));
    }
}
