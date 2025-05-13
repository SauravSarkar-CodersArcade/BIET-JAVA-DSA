package com.dsa.dataStructures.trees.SortedArrayToBalancedBST;

class BST{
    int data;
    BST left;
    BST right;
    BST(int val){
        data = val;
        left = null;
        right = null;
    }
}
public class BalancedBSTFromSortedArray {
    static void inOrderTraversal(BST root){
        if(root != null){
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }
    static BST sortedArrayToBalancedBST(int[] arr, int s, int e){
        if(s > e){
            return null;
        }
        int mid = s + (e-s)/2;
        BST root = new BST(arr[mid]);
        // recursive call for the left side of the array
        root.left = sortedArrayToBalancedBST(arr,s,mid-1);
        // recursive call for the right side of the array
        root.right = sortedArrayToBalancedBST(arr,mid+1,e);
        return root;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        BST root = sortedArrayToBalancedBST(arr,0,n-1);
        System.out.println("Inorder: ");
        inOrderTraversal(root);
        System.out.println();
    }

}
