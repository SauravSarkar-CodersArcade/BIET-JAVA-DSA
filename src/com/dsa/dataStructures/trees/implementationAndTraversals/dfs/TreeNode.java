package com.dsa.dataStructures.trees.implementationAndTraversals.dfs;
public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        this.left = this.right = null; // No children
    }
    public static void preOrder(TreeNode root){
        if(root != null){// DLR
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void inOrder(TreeNode root){
        if(root != null){ // LDR
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    public static void postOrder(TreeNode root){
        if(root != null){ // LRD
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
    public static void main(String[] args) {
        // Top to Bottom, Left to Right - Level By Level
        TreeNode root = new TreeNode(1); // Level 0
        // Level 1
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        // Level 2
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        // Level 3
        root.left.right.left = new TreeNode(9);
        root.right.right.left = new TreeNode(15);
        System.out.print("PreOrderTraversal: ");
        preOrder(root);
        System.out.println();
        System.out.print("InOrderTraversal: ");
        inOrder(root);
        System.out.println();
        System.out.print("PostOrderTraversal: ");
        postOrder(root);
        System.out.println();
    }

}
