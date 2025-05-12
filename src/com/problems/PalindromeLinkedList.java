package com.problems;

import java.util.Stack;

class ListNode{
    int data;
    ListNode next;
    ListNode(int val){
        data = val;
        next = null;
    }
}
public class PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head){
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        // Traverse first & push all nodes onto stack
        while (temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        // Now compare the nodes with the stack elements
        while (temp != null){
            if(temp.data != stack.pop()){
                return false;
            }
            temp = temp.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        System.out.println(isPalindrome(head)?
                "Palindrome" : "Not Palindrome");
    }
}
