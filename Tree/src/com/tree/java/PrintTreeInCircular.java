package com.tree.java;

public class PrintTreeInCircular {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        
        
        circularPrint(root);
    }

    private static void circularPrint(TreeNode root) {
        if (root == null) {
            return;
        }

        printLeftBoundary(root);

        printLeaves(root);

        printRightBoundary(root);
    }

    private static void printLeftBoundary(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            System.out.print(root.val + " ");  
            printLeftBoundary(root.left);      
        } else if (root.right != null) {       
            System.out.print(root.val + " ");
            printLeftBoundary(root.right);
        }
    }

    private static void printLeaves(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            System.out.print(root.val + " ");
        }

        printLeaves(root.left);  
        printLeaves(root.right);  
    }

    private static void printRightBoundary(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.right != null) {
            printRightBoundary(root.right);  
            System.out.print(root.val + " ");
        } else if (root.left != null) {      
            printRightBoundary(root.left);
            System.out.print(root.val + " ");
        }
    }
}



