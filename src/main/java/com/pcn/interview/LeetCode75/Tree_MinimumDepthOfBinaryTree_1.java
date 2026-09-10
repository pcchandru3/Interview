package com.pcn.interview.LeetCode75;

public class Tree_MinimumDepthOfBinaryTree_1 {

    public int minDepthBinaryTree(TreeNode root) {
    // Given the root of a binary tree, return its maximum depth.
    // A binary tree's minimum depth is the number of nodes along the
    // longest path from the root node down to the farthest leaf node.

    // Input: root = [3,9,20,null,null,15,7]
    // Output: 2

        if(root == null)
            return 0;

        if(root.left == null)
            return 1 + minDepthBinaryTree(root.right);
        if(root.right == null)
            return 1 + minDepthBinaryTree(root.left);

        return 1 + Math.min(minDepthBinaryTree(root.left), minDepthBinaryTree(root.right));

    }

}
