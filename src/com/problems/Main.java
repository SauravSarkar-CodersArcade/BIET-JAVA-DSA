package com.problems;
class Node {
    int data;
    Node next;
    public Node(int val){
        data = val;
        next = null;
    }
}
public class Main {
    public static boolean detectCycle(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;
        System.out.println(detectCycle(head)
        ? "Cycle Detected." : "No Cycle.");

    }
}
