package com.dsa.dataStructures;
public class Queue {
    private static final int MAX_SIZE = 100;
    private int[] arr = new int[MAX_SIZE];
    private int front;
    private int rear;
    public Queue(){
        front = rear = -1; // Empty
    }
    public boolean isFull(){
        return rear == MAX_SIZE - 1;
    }
    public boolean isEmpty(){
        return (front == -1 &&  rear == -1);
    }
    public void enqueue(int element){
        if(isFull()){
            System.out.println("Queue is full.");
            return;
        }else if(isEmpty()){
            front = rear = 0;
        }else {
            rear++;
        }
        arr[rear] = element;
        System.out.println("The element added is: " + element);
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty.");
        }else if(front == rear){
            front = rear = -1;
        }else {
            front++;
        }
    }
    public int getFront(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }else {
            return arr[front];
        }
    }
    public int getRear(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }else {
            return arr[rear];
        }
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty.");
            return;
        }
        for (int i=front; i<=rear; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public int size(){
        return rear+1;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        int[] arr = {10,20,30,40,50};
        for (int x : arr){
            queue.enqueue(x);
        }
        queue.display();
        System.out.println(queue.size());
        System.out.println("Front: " + queue.getFront());
        System.out.println("Rear: " + queue.getRear());
        queue.dequeue();
        queue.display();
        System.out.println("Front: " + queue.getFront());
        System.out.println("Rear: " + queue.getRear());
        System.out.println(queue.size());
    }
}
