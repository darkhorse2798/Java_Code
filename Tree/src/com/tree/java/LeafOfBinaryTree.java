package com.tree.java;



public class LeafOfBinaryTree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left= new TreeNode(2);
		root.right= new TreeNode(3);
		
		TreeNode leftNode =root.left;
		TreeNode rightNode=root.right;
		
		leftNode.left= new TreeNode(4);
		leftNode.right=new TreeNode(5);
		
		rightNode.left= new TreeNode(6);
		rightNode.right= new TreeNode(7);
		
		
		leafOfTree(root);
	}

	private static void leafOfTree(TreeNode root) {
		if(root==null) {
			return;
		}
		if(root.left==null && root.right==null) {
			System.out.println(root.val);
		}
		leafOfTree(root.left);
		leafOfTree(root.right);
	}

}
