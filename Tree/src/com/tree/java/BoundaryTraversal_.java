package com.tree.java;

public class BoundaryTraversal_ {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		 root.left = new TreeNode(2);
		 root.right = new TreeNode(3);
		 
		 root.left.left= new TreeNode(4);
		 root.left.right= new TreeNode(5);
		 
		 root.right.right=new TreeNode(6);
		 root.right.right.right=new TreeNode(7);
		 
		 printBoundariTraversal(root);		 
		 
	}

	private static void printBoundariTraversal(TreeNode root) {
	  if(root==null) {
		  return;
	  }
	  System.out.print(root.val+"-->");
		printLeftBoundary(root.left);
		printLeafs(root.left);
		printLeafs(root.right);
		printRightBoundary(root.right);
     
	}

	private static void printRightBoundary(TreeNode root) {
		if(root!=null) {
			if(root.left!=null) {
				System.out.print(root.val+"-->");
				printRightBoundary(root.left);
			}
			else if(root.right!=null) {
				System.out.print(root.val+"-->");
				printRightBoundary(root.right);
			}
		}
		
		
	}

	private static void printLeafs(TreeNode root) {
			if(root==null) {
				return;
			}
			if(root.left==null && root.right==null) {
				System.out.print(root.val+"-->");
				
			}
			printLeafs(root.left);
			printLeafs(root.right);
		
	}

	private static void printLeftBoundary(TreeNode root) {
		if(root!=null) {
			if(root.right!=null) {
				System.out.print(root.val+"-->");
				printRightBoundary(root.right);
			}
			else if(root.left!=null) {
				System.out.print(root.val+"-->");
				printRightBoundary(root.left);
			}
			
		}
		
		
	}	
	

}
