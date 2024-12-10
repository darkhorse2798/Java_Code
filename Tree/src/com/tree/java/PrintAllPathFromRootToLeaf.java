package com.tree.java;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPathFromRootToLeaf {
	
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
		
		List<Integer> path = new ArrayList<>();
		
		printAllPath(root,path);
		
		
	}
	public static void printAllPath(TreeNode root,List<Integer> path) {
		if(root==null) return;
		
		path.add(root.val);
		if(root.left==null && root.right==null) {
			System.out.println(path);
			
		}else {
			printAllPath(root.left,new ArrayList<>(path));
			printAllPath(root.right,new ArrayList<>(path));
		}
	}

}
