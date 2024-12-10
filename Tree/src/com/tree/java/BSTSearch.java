package com.tree.java;

public class BSTSearch {
	    // Function to search for a value in a BST
	    public static boolean searchInBST(TreeNode root, int target) {
	        if (root == null) {
	            return false; // Value not found
	        }
	        
	        if (root.val == target) {
	            return true; // Value found
	        }
	        
	        if (target < root.val) {
	            return searchInBST(root.left, target);
	        }
	        
	        return searchInBST(root.right, target);
	    }
	    
	    public static void main(String[] args) {
	        TreeNode root = new TreeNode(20);
	        root.left = new TreeNode(10);
	        root.right = new TreeNode(30);
	        root.left.left = new TreeNode(5);
	        root.left.right = new TreeNode(15);

	        int target = 20;
	        boolean result = searchInBST(root, target);
	        System.out.println("Is " + target + " present in BST? " + result);
	    }
	}



