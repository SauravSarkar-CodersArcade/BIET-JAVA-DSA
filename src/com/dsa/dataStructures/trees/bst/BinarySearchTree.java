package com.dsa.dataStructures.trees.bst;
class TreeNode {
    int data;
    TreeNode left, right;
    TreeNode(int value){
        data = value;
        left = null;
        right = null;
    }
}
public class BinarySearchTree {
    static void inOrder(TreeNode root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    static TreeNode insert(TreeNode root, int key){
        if(root == null){
            return new TreeNode(key);
            // Create a new node & make it the root & return
        }
        if(key < root.data){
            root.left = insert(root.left, key);
        }else if(key > root.data){
            root.right = insert(root.right,key);
        }
        return root;
    }
    static TreeNode search(TreeNode root, int key){
        // Root is null or the key is found @ Root
        if(root == null || root.data == key){
            return root;
        }
        if(root.data < key){
            return search(root.right,key);
        }
       return search(root.left,key);
    }
    static TreeNode findMin(TreeNode root){
        TreeNode curr = root;
        while (curr != null && curr.left != null){
            curr = curr.left; // Keep going left to find leaf node
        }
        return curr;
    }
    static TreeNode deleteNode(TreeNode root, int key){
        if(root == null){
            return root;
        }
        if(key < root.data){
            root.left = deleteNode(root.left,key);
        }else if(key > root.data){
            root.right = deleteNode(root.right,key);
        }else{
            // Only one child
            if(root.left == null){
                TreeNode temp = root.right;
                root = null;
                return temp;
            } else if (root.right == null) {
                TreeNode temp = root.left;
                root = null;
                return temp;
            }
            // Node with 2 children *** important
            // Find the in-order successor of the root node
            // Replace the root node with the successor
            TreeNode temp = findMin(root.right);
            root.data = temp.data; // This creates a duplicate
            // So, delete the duplicate
            root.right = deleteNode(root.right, temp.data);
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = null;
        root = insert(root,50);
        int[] arr = {30,40,80,70,10,90};
        for (int ele : arr){
            insert(root, ele);
        }
        System.out.print("InOrder Traversal: ");
        inOrder(root);
        System.out.println();
        int key = 10;
        TreeNode result = search(root,key);
        if(result == null){
            System.out.println("Key " + key +  " is not found.");
        }else {
            System.out.println("Key " + key +  " is found.");
        }
        System.out.println("Delete 50");
        root = deleteNode(root,50);
        System.out.print("InOrder Traversal: ");
        inOrder(root);
        System.out.println();
    }
}
