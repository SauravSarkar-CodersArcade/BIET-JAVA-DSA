package com.dsa.dataStructures;
import java.util.Stack;
public class StackExample {
    public static void displayStack(Stack<Integer> s){
        while (!s.empty()){
            System.out.print(s.peek() + " ");
            s.pop();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = {10,2,1,3,5,0};
        for (int element : arr){
            stack.push(element);
        }
        displayStack(stack);
    }
}
