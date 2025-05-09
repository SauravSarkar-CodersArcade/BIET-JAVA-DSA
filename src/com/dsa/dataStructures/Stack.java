package com.dsa.dataStructures;
public class Stack {
    private static final int MAX_SIZE = 100;
    private int[] arr = new int[MAX_SIZE];
    private int top;
    public Stack(){
        top = -1; // Empty Stack
    }
    public boolean isFull(){
        return top == MAX_SIZE - 1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public void push(int element){
        if(isFull()){
            System.out.println("Stack Overflow.");
            return;
        }
        top++;
        arr[top] = element;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow.");
            return -1;
        }
        else {
            return arr[top--];
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow.");
            return -1;
        }else {
            return arr[top];
        }
    }
    public int size(){
        return top + 1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        int[] arr = {1,2,3,4,5};
        for (int element : arr){
            stack.push(element);
        }
        System.out.println("Top element: " + stack.peek());
        System.out.println("Top Element: " + stack.pop());
        System.out.println("Top element: " + stack.peek());
        System.out.println("Size: " + stack.size());
    }

}
