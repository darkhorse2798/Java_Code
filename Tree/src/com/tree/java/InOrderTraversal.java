package com.tree.java;

public class InOrderTraversal {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(4);
		
		root.left = new TreeNode(5);
		root.right= new TreeNode(6);
		
		TreeNode leftNode = root.left;
		TreeNode rightNode=root.right;
		
		leftNode.left=new TreeNode(7);
		leftNode.right=new TreeNode(8);
		
		rightNode.right=new TreeNode(9);
		rightNode.left=new TreeNode(10);
		
		inOrderTraversal(root);
		
		
		
	}
	public static void inOrderTraversal(TreeNode root){
		if(root==null) {
			return ;
		}
		inOrderTraversal(root.left);
		
		System.out.print(root.val+"-->");
		
		inOrderTraversal(root.right);

		
	}

}
