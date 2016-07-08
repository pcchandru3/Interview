package com.pcn.interview;

import java.util.Scanner;

public class PowerOf2 {

	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer : ");
		int n  = scanner.nextInt();
		
		
		// Method 1
		if( (n & (n-1)) == 0)
			System.out.println("n is power of 2");
		else
			System.out.println("n is not power of 2");
		
		
		
		
		boolean flag = true;
		
		while(n>1){
			
			if(n%2!=0){
				flag= false;
				break;
			}
			
			n = n/2;
				
		}
		
		if(flag)
			System.out.println("power of 2");
		else
			System.out.println("Not power of 2");
		
		
		
		
		
	}
}
