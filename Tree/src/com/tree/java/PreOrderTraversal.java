package com.tree.java;

public class PreOrderTraversal {
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		
		root.left = new TreeNode(2);
		root.right= new TreeNode(3);
		
		TreeNode leftNode = root.left ;
		
		TreeNode rightNode = root.right;
		
		leftNode.left= new TreeNode(4);
		leftNode.right= new TreeNode(5);
		
		rightNode.left= new TreeNode(6);
		rightNode.right= new TreeNode(7);
		
		preOrederTravelSal(root);
		
		
		
		
	}

	private static void preOrederTravelSal(TreeNode root) {
		if(root==null) return;
		
		System.out.print(root.val+"-->");
		
		preOrederTravelSal(root.left);
		preOrederTravelSal(root.right);
		
		
		
		
	}

}
