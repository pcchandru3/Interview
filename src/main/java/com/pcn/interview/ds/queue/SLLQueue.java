package com.pcn.interview.ds.queue;

import com.pcn.interview.ds.linkedlist.SLLNode;

public class SLLQueue {
	
	SLLNode front, rear;
	
	
	public void enQueue(String value){
		SLLNode newNode = new SLLNode(value);
		
		if(front == null){
			front = newNode;
			rear = newNode;
		}
		else {
			rear.next = newNode;
			rear = rear.next;
		}
	}
	
	public String deQueue() {
		String value="";
		
		if(front!=null){
			value = front.data;
			front = front.next;
		}
		
		return value;
		
	}
	
	public void print() {
		
		SLLNode temp = front;
		while(temp!=null){
			System.out.println(temp.data);
			temp = temp.next;
		}
		
	}
	
	public static void main(String[] args){
		
		SLLQueue q = new SLLQueue();
		q.enQueue("one");
		q.enQueue("two");
		q.enQueue("three");
		
		q.print();
		
		q.deQueue();
		q.print();
		
	}
	
	

}
