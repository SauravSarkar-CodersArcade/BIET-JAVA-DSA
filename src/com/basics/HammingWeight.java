package com.basics;
public class HammingWeight {
    public static void main(String[] args) {
        System.out.println("HW of 5: " + hammingWeightUsingModulus(5));
        System.out.println("HW of 0: " + hammingWeightUsingModulus(0));
        System.out.println("HW of 11: " + hammingWeightUsingModulus(11));
        System.out.println("HW of 8: " + hammingWeightUsingModulus(8));
        System.out.println("HW of 5: " + hammingWeight(5));
        System.out.println("HW of 0: " + hammingWeight(0));
        System.out.println("HW of 11: " + hammingWeight(11));
        System.out.println("HW of 8: " + hammingWeight(8));
    }
    static int hammingWeightUsingModulus(int n){
        int count = 0;
        while (n != 0){
            if(n % 2 != 0){
                count++;
            }
            n = n / 2;
        }
        return count;
    }
    static int hammingWeight(int n){
        int count = 0;
        while (n > 0){
            if((n & 1) == 1){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}
