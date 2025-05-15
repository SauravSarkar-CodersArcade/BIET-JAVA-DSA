package com.dsa.algos.dp;
public class FibonacciOptimized {
    public static int fib(int n){ // Only using 2 vars so SC = O(1)
        if(n <= 1) return n;
        int prev2 = 0;
        int prev1 = 1;
        for (int i=2; i<=n; i++){
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
    public static void main(String[] args) {
        int n = 8;
        System.out.println(fib(n));
    }
}
