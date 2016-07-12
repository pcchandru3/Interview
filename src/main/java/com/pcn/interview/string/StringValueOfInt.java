package com.pcn.interview.string;

public class StringValueOfInt {

	
	
	
	public static void main(String[] args){
		
		int n=1251234;
		String str="";
		
		while(n>0){
			int a =  (n%10);
			n = n/10;
			
			str += a;
			
		}
		

		
		System.out.println(Character.isDigit('5'));
		System.out.println(Character.isLetter('1'));
		System.out.println(Character.isSpaceChar(' '));
		
		
		
		
		System.out.println(str+12.12);
		
	}
	
	
	
	
	
}
