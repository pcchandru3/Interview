package com.pcn.interview;

import java.util.Scanner;

public class ReadInput {
	
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string :");
		System.out.println("Entered " + scanner.next());
		
		System.out.println("Enter a number :");
		System.out.println("Entered " + scanner.nextInt());
		
		
		
		int i=10;
		String s = String.valueOf(i);
		
		s= Integer.toString(i);
		
		
	}

}
