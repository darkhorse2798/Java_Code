package com.tree.java;

public class BoundaryTraversals {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(8);
		root.right.right = new TreeNode(9);
		root.right.right.left = new TreeNode(10);
		root.right.right.right = new TreeNode(11);
		root.left.left = new TreeNode(4);

		root.left.left.left = new TreeNode(5);
		root.left.left.left.left = new TreeNode(6);
		root.left.left.left.right = new TreeNode(7);

		printBoundaryTraversal(root);
	}

	private static void printBoundaryTraversal(TreeNode root) {
		
		if(root==null) {
			return;
			
		}
		System.out.print(root.val+"-->");
		printLeftBoundaryTraversal(root.left);
		leafTraversal(root.left);
		leafTraversal(root.right);
		printRightBoundaryTraversal(root.right);

	}

	private static void printLeftBoundaryTraversal(TreeNode root) {
		if (root != null) {

			if (root.left != null) {
				System.out.print(root.val + "-->");
				printLeftBoundaryTraversal(root.left);

			} else if (root.right != null) {
				System.out.print(root.val + "-->");
				printLeftBoundaryTraversal(root.right);
			}
		}
	}

	private static void printRightBoundaryTraversal(TreeNode root) {
		if(root!=null) {
			if(root.right!=null) {
				printRightBoundaryTraversal(root.right);
				System.out.print(root.val + "-->");
			}
			else if(root.left!=null) {
				printRightBoundaryTraversal(root.left);
				System.out.print(root.val + "-->");
			}
		}

	}

	private static void leafTraversal(TreeNode root) {
		if(root==null) {
			return;
		}
		if(root.left==null && root.right==null) {
			System.out.print(root.val+" -->");
		}
		leafTraversal(root.left);
		leafTraversal(root.right);
		

	}
}
