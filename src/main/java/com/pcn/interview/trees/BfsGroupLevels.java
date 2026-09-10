package com.pcn.interview.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import com.pcn.interview.LeetCode75.TreeNode;

public class BfsGroupLevels {
    

    // Given the root of a binary tree, return the level order traversal 
    // of its nodes' values. (i.e., from left to right, level by level).
    // Input: root = [3,9,20,null,null,15,7]
    // Output: [[3],[9,20],[15,7]]

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();

        if(root == null) return list;

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> levelList = new ArrayList<>();

            for(int i=1;i<=levelSize;i++) {
                TreeNode curr = queue.poll();
                levelList.add(curr.val);

                if(curr.left != null)
                    queue.offer(curr.left);
                if(curr.right != null)
                    queue.offer(curr.right);
            }
            list.add(levelList); 
        }

        return list;
    }



    // Level order traversal and group the levels
    public List<List<Integer>> bfs(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();

        if(root == null) return list;

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> levelList = new ArrayList<>();

            for(int i=1;i<=levelSize;i++) {
                TreeNode curr = queue.poll();
                levelList.add(curr.val);

                if(curr.left != null)
                    queue.offer(curr.left);
                if(curr.right != null)
                    queue.offer(curr.right);
            }
            list.add(levelList);

            
        }

        return list;
    }



    // Average of each level val
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        if(root == null) return list;

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            double levelSum=0;

            for(int i=1;i<=levelSize;i++) {
                TreeNode curr = queue.poll();
                levelSum+= curr.val;

                if(curr.left != null)
                    queue.offer(curr.left);
                if(curr.right != null)
                    queue.offer(curr.right);
            }

            list.add(levelSum/levelSize);
        }

        return list;
        
    }

}


