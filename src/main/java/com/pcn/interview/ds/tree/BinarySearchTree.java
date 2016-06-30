package com.pcn.interview.ds.tree;

import com.pcn.interview.ds.node.TreeNode;

public class BinarySearchTree {
	
	TreeNode root=null;
	
	
	public void insert(int value){
		TreeNode node = new TreeNode(value);
		TreeNode parent;
		
		
		if(root ==null){
			root = node;
		}
		else {
			TreeNode temp = root;
			
			while(true){
				parent = temp;
				
				if(value > temp.data){
					temp = temp.right;
					if(temp==null){
						parent.right = node;
						break;
					}
					
				}
				else {
					temp = temp.left;
					if(temp == null){
						parent.left = node;
						break;
					}
				}
				
			}
			
			
			
		}
		
		
		
		
		
	}
	
	
	
	
	public void preOrder(TreeNode node) {
		
		if(node!=null){
			System.out.println(node.data);
			preOrder(node.left);
			preOrder(node.right);
		}
		
		
	}
	
	
	
	public void postOrder(TreeNode node) {
		
		if(node!=null){
			
			preOrder(node.left);
			preOrder(node.right);
			System.out.println(node.data);
		}
		
		
	}
	
	public void inOrder(TreeNode node) {
		
		if(node!=null){
			
			preOrder(node.left);
			System.out.println(node.data);
			preOrder(node.right);
			
		}
		
		
	}
	
	
	
	public TreeNode search(int data){
		TreeNode node=null;
		TreeNode temp = this.root;
		
		if(temp!=null){
			
			while(true){
				
				if(temp.data == data){
					node = temp;
					break;
				}
				else {
					if(temp.data < data)
						temp = temp.right;
					else
						temp = temp.left;
				}
				
				
				if(temp == null)
					break;
			}
		
		}
		
		
		return node;
		
		
		
	}
	
	public static void main(String[] args){
		
		BinarySearchTree bt = new BinarySearchTree();
		bt.insert(100);
		
		bt.insert(10);
		
		bt.insert(110);
		
		bt.preOrder(bt.root);
		bt.postOrder(bt.root);
		bt.inOrder(bt.root);
		
		
		
		
		System.out.println(bt.search(120).data);
		
	}
	
	
	

}
