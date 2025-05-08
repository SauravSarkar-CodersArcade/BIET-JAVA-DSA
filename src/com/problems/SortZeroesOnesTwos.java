package com.problems;
import java.util.Arrays;
public class SortZeroesOnesTwos {
    static void sortZeroOneTwo(int[] arr){
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        for (int j : arr) {
            if (j == 0) c0++;
            else if (j == 1) c1++;
            else c2++;
        }
        int index = 0;
        while (c0 > 0){
            arr[index++] = 0;
            c0--;
        }
        while (c1 > 0){
            arr[index++] = 1;
            c1--;
        }
        while (c2 > 0){
            arr[index++] = 2;
            c2--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,0,2,1,2,0};
        sortZeroOneTwo(arr);
    }
}
