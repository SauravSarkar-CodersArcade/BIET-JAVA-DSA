package com.dsa.algos.searching;
public class LinearSearch {
    public static int linearSearch(int[] arr, int key){
        for (int i=0; i< arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,3,-2,4,-6,7,9};
        System.out.println(linearSearch(arr, 41));
    }
}
