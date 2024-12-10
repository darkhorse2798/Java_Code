package com.tree.java;

public class FindLevelOfTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);

        TreeNode leftNode = root.left;
        TreeNode rightNode = root.right;

        leftNode.left = new TreeNode(15);
        leftNode.right = new TreeNode(3);

        rightNode.left = new TreeNode(4);
        rightNode.right = new TreeNode(7);

        System.out.println(levelOfBinaryTree(root, 0, 0)); 
    }

    private static int levelOfBinaryTree(TreeNode root, int target, int level) {
        if (root == null) return -1;

        if (root.val == target) return level;

        int leftLevel = levelOfBinaryTree(root.left, target, level + 1);

        if (leftLevel != -1) return leftLevel;

        return levelOfBinaryTree(root.right, target, level + 1);
    }
}
