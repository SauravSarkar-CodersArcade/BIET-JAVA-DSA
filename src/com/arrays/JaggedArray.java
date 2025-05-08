package com.arrays;
public class JaggedArray {
    public static void main(String[] args) {
        int[][] jagged = {{1,2,3,4,5,6},
                          {5,6,7,8},
                          {9,8}}; // Array of arrays
        // Three rows & unequal columns
        // The length of each row is different -> Jagged Array
        // array[row].length
        for (int i = 0; i< jagged.length; i++){ // rows
            for (int j = 0; j<jagged[i].length; j++){ // cols
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
        for(int[] arr : jagged){
            for(int x : arr){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
