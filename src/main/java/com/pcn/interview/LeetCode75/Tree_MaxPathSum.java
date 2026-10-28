package com.pcn.interview.LeetCode75;

public class Tree_MaxPathSum {

    public int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        getMaxSum(root);
        return maxSum;    
    }

    public int getMaxSum (TreeNode root) {
        if(root == null)
            return 0;


        int leftSum = Math.max(getMaxSum(root.left), 0);
        int rightSum = Math.max(getMaxSum(root.right), 0);
        int currentNodeSum = root.val + leftSum + rightSum;

        maxSum = Math.max(currentNodeSum, maxSum);

        return root.val + Math.max(rightSum, leftSum);
    }

}
