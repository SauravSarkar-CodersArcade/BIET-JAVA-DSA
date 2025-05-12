package com.dsa.dataStructures.linkedLists;
class LL {
    Node head;
    private int size;
    LL(){
        size = 0;
    }
    public class Node {
        String data;
        // Node prev; this you can use for DLL
        Node next;
        Node(String data){
            this.data = data;
            this.next = null; // We don't have the next node
            size++; // Increment the number of nodes
        }
    }
    public void printList(){
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }
    public void addFirst(String data){
        // Create a new Node
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
        // Create a new Node
        Node newNode = new Node(data);
        // Empty list
        if(head == null){
            head = newNode;
            return;
        }
        // If there are multiple nodes
        // Traverse till the last node & add the new node after that last node
        Node last = head;
        while (last.next != null){
            last = last.next;
        }
        last.next = newNode;
    }
    public void removeFirst(){
        if(head == null){
            System.out.println("Empty list, nothing to delete.");
            return;
        }
        // For a single node, head will point to next node(null)
        // For multiple nodes, head will point to next node
        head = this.head.next;
        size--;
    }
    public void removeLast(){
        if(head == null){
            System.out.println("Empty list, nothing to delete.");
            return;
        }
        // Single element
        if(head.next == null){
            head = null;
            return;
        }
        // Multiple Nodes
        Node curr = head;
        Node last = head.next;
        while (last.next != null){
            curr = last;
            last = last.next;
        }
        curr.next = null;
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("CSE");
        list.addFirst("in");
        list.addFirst("is");
        list.addFirst("Ramanand");
        list.addLast("A");
        list.addLast("Section");
        list.removeLast();
        list.removeFirst();
        list.printList();
    }

}
