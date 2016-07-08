package com.pcn.interview;

public class FindNoOf1s {
	
	public static void main(String[] args){
		int n=30;
		
		int result = 0;
		boolean flag = false;
		
		while(n>0){
			
			if((n % 2)==1){
				result+=1;
				flag |= ((n % 2)==1);
			}
			n = n/2;
			
			
		}
		System.out.println(result);
		if(flag)
			System.out.println("even");
		else
			System.out.println("odd");
	}
	
	

}
