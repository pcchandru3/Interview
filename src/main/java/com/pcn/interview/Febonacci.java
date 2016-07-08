package com.pcn.interview;

public class Febonacci {
	
	
	public static void main(String[] args){
		
		int count =11;
		int n1=0,n2=1,n3;
		
		int sum = 1;
		System.out.print(n1 + " " + n2);
		for(int i=2;i<count;i++){
			n3=n1+n2;
			n1=n2;
			n2=n3;
			sum += n3;
			System.out.print(" " + n3);
		}
		
		
		System.out.println("Sum = "+sum);
		
		
		
		System.out.println("Feb Sum : " + febSum(count));
		
	}

	
	
	public static int febSum(int n){
		
		if(n==0)
			return 0;
		if (n==1)
			return 1;
		
		else
			return febSum(n-1) + febSum(n-2);
				
	}
	
	
	
	
}
