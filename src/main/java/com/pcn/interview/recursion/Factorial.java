package com.pcn.interview.recursion;

public class Factorial {
	
	public int fact(int n){
		//int result=0;
		if(n==1)
			return 1;
		
		return fact(n-1) * n;
		
		
		//return result;
	}
	
	
	
	public static void main(String[] a){
		Factorial f = new Factorial();
		System.out.println(f.fact(5));
		
	}

}


