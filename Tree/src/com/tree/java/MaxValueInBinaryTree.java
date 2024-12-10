package com.tree.java;

public class MaxValueInBinaryTree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);

		root.left= new TreeNode(2);
		root.right= new TreeNode(3);
		
		TreeNode leftNode =root.left;
		TreeNode rightNode=root.right;
		
		leftNode.left= new TreeNode(4);
		leftNode.right=new TreeNode(12);
		
		rightNode.left= new TreeNode(6);
		rightNode.right= new TreeNode(7);
		
		System.out.println(maxValue(root));
		
	}

	private static int maxValue(TreeNode root) {
		if(root==null) return Integer.MIN_VALUE;
		int maxValue=root.val;
		int leftMax=maxValue(root.left);
		int rightMax=maxValue(root.right);
		return Math.max(maxValue, Math.max(leftMax, rightMax));
		
	}

}
