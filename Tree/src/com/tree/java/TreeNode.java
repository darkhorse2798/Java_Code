package com.tree.java;

public class TreeNode {
	int val;
	public TreeNode left;
	public TreeNode right;
	public TreeNode(int x) {
		this.val = x;
		this.left=null;
		this.right=null;
		
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(4);
		root.left= new TreeNode(8);
		root.right= new TreeNode(15);
		
		TreeNode leftNode=  root.left;
		TreeNode rightNode= root.right;
		
		leftNode.left= new TreeNode(10);
		leftNode.right= new TreeNode(11);
		
		rightNode.left= new TreeNode(51);
		rightNode.right = new TreeNode(19);
		
		
		
		System.out.println(root.val);
		
		System.out.println(root.right.left.val);
		
	}

}
