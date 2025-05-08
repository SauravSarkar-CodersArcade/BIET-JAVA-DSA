package com.problems;
public class SqRootBS {
    public static int sqRootBinarySearch(int n){
        int s = 0;
        int e = n;
        int ans = -1;
        while (s <= e){
            int mid = s + (e-s)/2;
            int square = mid * mid;
            if(square == n){
                return mid;
            } else if (square < n) {
                // Store the possible answer(mid) & move to the RHS
                ans = mid;
                s = mid + 1;
            }else {
                // Move to the LHS because the value is bigger than n
                e = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(sqRootBinarySearch(36));
        System.out.println(sqRootBinarySearch(37));
    }
}
