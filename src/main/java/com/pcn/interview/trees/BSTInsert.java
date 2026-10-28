package com.pcn.interview.trees;

import com.pcn.interview.LeetCode75.TreeNode;

public class BSTInsert {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null)
            return new TreeNode(val);
        if(val < root.val)
            root.left = insertIntoBST(root.left, val);
        else
            root.right = insertIntoBST(root.right, val);

        return root;
    }


    public TreeNode insertIntoBSTIterative (TreeNode root, int val) {
        TreeNode newNode = new TreeNode(val);

        TreeNode curr = root;
        while(curr != null) {
            if(val < curr.val) {
                if(curr.left == null){
                    curr.left = newNode;
                    return root;
                }
                curr = curr.left;
            }
            else {
                if(curr.right == null){
                    curr.right = newNode;
                    return root;
                }
                curr = curr.right;
            }
        }
        return root;
    }

    public TreeNode insertIntoBST1(TreeNode root, int val) {
        if(root == null)
            return new TreeNode(val);
        if(val < root.val){
            if(root.left == null){
                root.left = new TreeNode(val);
                return root;
            }
            insertIntoBST(root.left, val); 
        }
        else {
            if(root.right == null){
                root.right = new TreeNode(val);
                return root;
            }
            insertIntoBST(root.right, val);
        }
        return root;
    }

}
