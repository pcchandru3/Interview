package com.pcn.interview.trees;

import java.util.ArrayDeque;
import java.util.Queue;

import com.pcn.interview.LeetCode75.TreeNode;

public class BfsMinDepth {
     public int minDepth(TreeNode root) {
        
        if (root == null)
            return 0;
        
        // int left = minDepth(root.left)+1;
        // int right = minDepth(root.right)+1;
        // return Math.min(left, right);

        // // dfs recursive
        // if (root.left == null)
        //     return 1 + minDepth(root.right);
        // else if (root.right == null)
        //     return 1 + minDepth(root.left);
        
        // return 1 + Math.min(minDepth(root.left), minDepth(root.right)) ;




        // bfs 
        int depth = 0;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            depth++;
            int levelSize = queue.size();

            for(int i=1;i<=levelSize;i++) {
                TreeNode curr = queue.poll();
                if(curr.left == null && curr.right == null)
                    return depth;

                if(curr.left != null)
                    queue.offer(curr.left);
                if(curr.right != null)
                    queue.offer(curr.right);    
            }
            
        }
        return depth;
        
    }




    public int minDepth1(TreeNode root) {
        
        if (root == null)
            return 0;
      
        // bfs 
        int depth = 0;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            depth++;
            int levelSize = queue.size();

            for(int i=1;i<=levelSize;i++) {
                TreeNode curr = queue.poll();

                if(curr == null)
                    continue;

                if(curr.left == null && curr.right == null)
                    return depth;

                queue.offer(curr.left);
                queue.offer(curr.right);    
            }
            
        }
        return depth;
        
    }


}
