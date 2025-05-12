package com.dsa.dataStructures.trees.implementationAndTraversals.bfs;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
        left = right = null;
    }
}
public class BinaryTree {
    static void levelOrderTraversal(TreeNode root){
        // Base Case :
        // If the tree is empty, don't traverse
        if(root == null){
            return;
        }
        // Queue to store the nodes
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll(); // Removes & retrieves the front value
            System.out.print(node.val + " ");
            // Left Subtree
            if(node.left != null){
                queue.add(node.left);
            }
            // Right Subtree
            if(node.right != null){
                queue.add(node.right);
            }
        }
        System.out.println();
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
        System.out.println("BFS or Level Order:");
        levelOrderTraversal(root);
    }
}
