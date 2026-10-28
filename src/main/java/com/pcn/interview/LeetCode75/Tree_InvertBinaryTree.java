package com.pcn.interview.LeetCode75;

public class Tree_InvertBinaryTree {
    public TreeNode invertBinaryTree(TreeNode root) {
        if(root == null)
            return null;

        swapTree(root);
        invertBinaryTree(root.left);
        invertBinaryTree(root.right);
        return root;
    }


    public void swapTree(TreeNode root) {
        TreeNode curr = root.left;
        root.left = root.right;
        root.right = curr;
    }

}
