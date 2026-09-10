package com.pcn.interview.LeetCode75;

public class Tree_SameTree {
    
    public boolean isSameTree (TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;

        if(p == null || q == null)
            return false;

        // if(p.val != q.val)
        //     return false;

        return (p.val != q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
        
    }

}
