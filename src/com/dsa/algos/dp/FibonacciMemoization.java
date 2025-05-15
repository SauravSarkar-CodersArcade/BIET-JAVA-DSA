package com.dsa.algos.dp;
import java.util.Arrays;
public class FibonacciMemoization { // O(n) O(n)
    public static int fib(int n, int[] dp){
        if(n <= 1) return n;
        // Step 2
        if(dp[n] != -1) return dp[n];
        // Step 3
        return dp[n] = fib(n-1, dp) + fib(n-2, dp);
    }
    public static void main(String[] args) {
        int n = 6;
        // Step 1
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println
                ("Fibonacci of " + n + "th is " + fib(n,dp));
    }
}
