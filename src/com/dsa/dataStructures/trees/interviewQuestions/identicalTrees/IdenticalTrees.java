package com.dsa.dataStructures.trees.interviewQuestions.identicalTrees;
class Node {
    int data;
    Node left;
    Node right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
public class IdenticalTrees {
    static boolean areIdentical(Node tree1, Node tree2){
        // Both are empty
        if(tree1 == null && tree2 == null){
            return true;
        }
        // One of them is empty
        if(tree1 == null || tree2 == null){
            return false;
        }
        // Compare the values of the root node
        if(tree1.data != tree2.data){
            return false;
        }// Use recursion for the left & right subtrees
        return areIdentical(tree1.left, tree2.left) &&
        areIdentical(tree1.right, tree2.right);
    }

    public static void main(String[] args) {
        Node tree1 = new Node(1);
        tree1.left = new Node(2);
        tree1.right = new Node(3);

        Node tree2 = new Node(1);
        tree2.left = new Node(2);
        tree2.right = new Node(3);

        Node tree3 = new Node(1);
        tree3.left = new Node(2);
        tree3.right = new Node(3);

        Node tree4 = new Node(4);
        tree4.left = new Node(5);
        tree4.right = new Node(6);

        if(areIdentical(tree1,tree2)){
            System.out.println("T1 & T2 are identical.");
        }else {
            System.out.println("T1 & T2 are not identical.");
        }
        if(areIdentical(tree3,tree4)){
            System.out.println("T3 & T4 are identical.");
        }else {
            System.out.println("T3 & T4 are not identical.");
        }
    }
}
