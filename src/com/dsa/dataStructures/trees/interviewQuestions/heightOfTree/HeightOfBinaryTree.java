package com.dsa.dataStructures.trees.interviewQuestions.heightOfTree;
class Node {
    int data;
    Node left;
    Node right;
    Node(int x){
        data = x;
        left = right = null;
    }
}
public class HeightOfBinaryTree {
    static int findHeight(Node root){
        // If the tree is empty, height is 0
        if(root == null) return 0;
        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);
        return Math.max(leftHeight,rightHeight) + 1;
        // We add one because we need to consider the root node as well
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.right = new Node(4);
        System.out.println("Height of the tree: " + findHeight(root));
    }
}
