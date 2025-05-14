package com.dsa.collections;
import java.util.LinkedList;
import java.util.Queue;
public class BinaryNumberGenerator {
    public static void generateBinaryNumber(int N){
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while (N-- > 0){
            String curr = q.poll();
            System.out.print(curr + " ");
            q.add(curr + "0");
            q.add(curr + "1");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int N = 5;
        generateBinaryNumber(N);
    }
}
