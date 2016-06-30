package com.pcn.interview.ds.stack;

import com.pcn.interview.ds.linkedlist.SLLNode;

public class SLLStack {
	
	
	SLLNode top=null;
	
	
	public void push(String value){
		
		SLLNode node = new SLLNode(value);
		node.next = top;
		top = node;
	}
	
	public String pop(){
		String value="";
		
		if(top!=null){
			value = top.data;
			top = top.next;
		}
		
		
		return value;
	}
	
	
	
	void print(){
		SLLNode temp = top;
		while(temp!=null){
			System.out.println(temp.data);
			temp = temp.next;
		}
			
	}
	
	
	
	public static void main(String[] args){
		
		SLLStack s = new SLLStack();
		s.push("one");
		s.push("Two");
		s.push("three");
		
		s.print();
		
		s.pop();
		s.print();
		
		
		
	}
	
	

}
