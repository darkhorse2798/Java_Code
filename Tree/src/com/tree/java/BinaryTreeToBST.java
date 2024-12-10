package com.tree.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class BinaryTreeToBST {

    // Function to convert binary tree to BST
    public static void binaryTreeToBST(TreeNode root) {
    	
        // Step 1: Perform inorder traversal and collect node values
        List<Integer> values = new ArrayList<>();
        inorderTraversal(root, values);

        // Step 2: Sort the values list
        Collections.sort(values);

        // Step 3: Assign the sorted values back to the tree
        Iterator<Integer> it = values.iterator();
        assignValuesToTree(root, it);
    }

    // Helper method to perform inorder traversal and store node values
    private static void inorderTraversal(TreeNode node, List<Integer> values) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left, values);
        
        values.add(node.val);
        
        inorderTraversal(node.right, values);
    }// 
    //

    // Helper method to assign sorted values to the tree
    private static void assignValuesToTree(TreeNode node, Iterator<Integer> it) {
        if (node == null) {
            return;
        }
        assignValuesToTree(node.left, it);
        node.val = it.next(); // Assign sorted value to the node
        assignValuesToTree(node.right, it);
    }

    // Function to print inorder traversal of the tree
    public static void inorderPrint(TreeNode node) {
        if (node == null) {
            return;
        }
        inorderPrint(node.left);
        System.out.print(node.val + " ");
        inorderPrint(node.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(30);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(15);
        
        System.out.println("Inorder traversal of original binary tree:");
        inorderPrint(root);
        
        // Convert binary tree to BST
        binaryTreeToBST(root);

        System.out.println("\nInorder traversal of the resulting Binary Search Tree:");
        inorderPrint(root); // Inorder traversal of BST should be sorted
    }
}
