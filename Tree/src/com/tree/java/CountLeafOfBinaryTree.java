package com.tree.java;

import java.util.ArrayList;
import java.util.List;

public class CountLeafOfBinaryTree {
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
		
		rightNode.left.left= new TreeNode(8);
		rightNode.left.right= new TreeNode(9);
		
		
		System.out.println(countLeafOfTree(root));
		
	}

	private static int countLeafOfTree(TreeNode root) {
		if(root==null) return 0;
		if(root.left==null && root.right==null) {
			return 1;
		}
		return countLeafOfTree(root.left)+ countLeafOfTree(root.right);
	}

}
