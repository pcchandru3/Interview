package com.pcn.interview.ds.linkedlist;

import org.junit.Test;

public class SingleLinkedList {
	
	SLLNode root;
	
	public void testSLL() {
		
		
		
	}
	
	public void addNode(SLLNode node){
		SLLNode temp = this.root;
		
		if(temp==null)
			root = node;
		else{
			while(temp.next != null)
				temp = temp.next;
			temp.next = node;
		}
	}
	
	public void printSLL() {
		SLLNode temp = this.root;
			while(temp != null){
			System.out.println(temp.data);
			temp = temp.next;
			
			
		}
		
		
	}
	
	public boolean insertAfterValue(SLLNode node, String value){
		
		boolean bDone = false;
		
		SLLNode temp = this.root;
		while(temp!= null){
			if(temp.data.equals(value)){
				node.next = temp.next;
				temp.next = node;
				bDone = false;
			}
			temp = temp.next;
		}
		
		
		
		return bDone;
		
		
		
		
	}
	
	public static void main(String[] args) {
		SingleLinkedList sll = new SingleLinkedList();
		sll.root = new SLLNode("one");
		
		// add node
		SLLNode node = new SLLNode("two");
		sll.addNode(node);
		node = null;
		
		node = new SLLNode("four");
		sll.addNode(node);
		node = null;
		
		node = new SLLNode("three");
		sll.insertAfterValue(node, "two");
		node = null;
		
		sll.printSLL();
		
	}
	
	
	

}
