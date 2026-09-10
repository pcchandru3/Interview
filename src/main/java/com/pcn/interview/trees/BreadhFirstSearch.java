package com.pcn.interview.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import com.pcn.interview.LeetCode75.TreeNode;

public class BreadhFirstSearch {
    
    // Level order traversal
    public List<Integer> bfs(TreeNode root) {
        if(root == null)
            return null;
        
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        List<Integer> list = new ArrayList<>();

        while (!queue.isEmpty()){
            TreeNode curr = queue.poll();
            list.add(curr.val);

            if(curr.left != null) 
                queue.offer(curr.left);

            if(curr.right != null)
                queue.offer(curr.right);

        }

        return list;
        
    }

}


