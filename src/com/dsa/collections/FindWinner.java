package com.dsa.collections;

public class FindWinner {
    int solve(int n, int k){
        // Base case
        if(n == 1){
            return 0; // 0-based indexing
        }
        return (solve(n-1,k) + k) % n;
    }
    public int findTheWinner(int n, int k) {
//        int winner = solve(n,k) + 1;
//        return winner;
        int winner = 0;
        for (int i=2; i<=n; i++){
            winner = (winner + k) % i;
        }
        return winner + 1;

    }
}
