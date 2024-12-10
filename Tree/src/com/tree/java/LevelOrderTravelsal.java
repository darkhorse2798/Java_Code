package com.tree.java;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTravelsal {
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
		
		levelOrderTraversal(root);
		
	}
 public static void levelOrderTraversal(TreeNode root) {
	 Queue<TreeNode> treeNodeQueue = new LinkedList<>();
	 
	 treeNodeQueue.add(root);
	 
	 
	 while(!treeNodeQueue.isEmpty()) {
		 TreeNode treeNode = treeNodeQueue.poll();
		 
		 System.out.print(treeNode.val+"-->");
		 
		 if(treeNode.left!=null) {
			 treeNodeQueue.add(treeNode.left);
		 }
		 if(treeNode.right!=null) {
			 treeNodeQueue.add(treeNode.right);
		 }
	 }
	 
 }
}
