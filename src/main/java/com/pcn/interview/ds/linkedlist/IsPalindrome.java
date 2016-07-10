package com.pcn.interview.ds.linkedlist;

import java.util.Scanner;

import org.junit.Test;

public class IsPalindrome {
	
	class Node {
		char c;
		Node next;
		
		
		
		public Node(char c){
			this.c = c;
		}
	}
	
	
	
	Node root;
	
	
	public void append(char c){
		
		Node newNode = new Node(c);
		Node temp = root;
		
		if(root==null)
			root= newNode;
		else{
			while(temp.next != null)
				temp = temp.next;
			
			
			temp.next = newNode;
			
		}
		
		
		
		
		
		
	}
	
	
	
	public boolean checkIfPalindrome() {
		
		boolean flag = true;
		StringBuilder s= new StringBuilder();
		
		Node temp = root;
		if(temp==null)
			return false;
		
		while(temp!=null){
			s.append(temp.c);
			temp = temp.next;
		}
		
		System.out.println(s.toString());
		System.out.println(s.reverse().toString());
		
		String ss = s.toString();
		
		for(int i=0,j=ss.length()-1; i<j;i++,j--){
			if(ss.charAt(i) != ss.charAt(j))
				flag = false;
		}
		
		
		
		
		return flag;
		
	}
	
	
	@Test
	public void test() {
		IsPalindrome p = new IsPalindrome();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a char to append. enter to break");
		
		while(scanner.hasNextLine()){
			
			
			
			String s = scanner.next();
			
			if(!s.equals("zzz")){
				
				char b = s.charAt(0);
				
				p.append(b);
				
			}
			else{
				scanner.close();
				break;
			}
				
			System.out.println("Enter a char to append. enter to break");
			
			
		}
		//p.append('A');
		
		
		
		if(p.checkIfPalindrome())
			System.out.println("Palindrome");
		else
			System.out.println("Not");
		
		
		
		
	}
	
	
	
	
	

}
