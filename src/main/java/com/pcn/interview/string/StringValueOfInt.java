package com.pcn.interview.string;

public class StringValueOfInt {

	
	
	
	public static void main(String[] args){
		
		int n=1251234;
		String str="";
		
		while(n>0){
			int a = (char) (n%10);
			n = n/10;
			
			str += a;
			
		}
		
		
		
		System.out.println(str+12.12);
		
	}
	
	
	
	
	
}
