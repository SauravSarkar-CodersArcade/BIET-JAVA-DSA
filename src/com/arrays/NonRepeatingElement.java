package com.arrays;
public class NonRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {3,1,2,2,4,1,3};
        int result = 0;
        for (int i=0; i< arr.length; i++){
            result = result ^ arr[i];
        }
        System.out.println(
                "The non-repeating element is: " + result);
    }
}
