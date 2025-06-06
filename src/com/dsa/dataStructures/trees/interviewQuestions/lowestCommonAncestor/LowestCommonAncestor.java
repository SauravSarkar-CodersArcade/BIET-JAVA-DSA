package com.dsa.dataStructures.trees.interviewQuestions.lowestCommonAncestor;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class LowestCommonAncestor {

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case: if root is null or matches p or q, return root
        if (root == null || root == p || root == q) {
            return root;
        }

        // Recur for left and right subtrees
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // If both sides return non-null, root is the LCA
        if (left != null && right != null) {
            return root;
        }

        // Otherwise, return non-null child
        return (left != null) ? left : right;
    }

    public static void main(String[] args) {
        // Construct the tree:
        /*
                1
               / \
              2   3
             / \
            4   5
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        TreeNode node4 = root.left.left;
        TreeNode node5 = root.left.right;
        TreeNode node3 = root.right;

        TreeNode lca = lowestCommonAncestor(root, node4, node5);
        System.out.println("LCA of 4 and 5: " + lca.val); // Output: 2

        TreeNode lca2 = lowestCommonAncestor(root, node4, node3);
        System.out.println("LCA of 4 and 3: " + lca2.val); // Output: 1
    }
}
