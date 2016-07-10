package com.pcn.interview;

public class SumOfDigits {
	
	
	public static void main(String[] args){
		int n = 1111111111;
		int sum = 0;
		
		while(n > 0){
			if(n%10 == n && sum!=0){
				//sum+=n;
				n=sum+n;
				sum=0;
				continue;
			}
			sum += n%10;
			n=n/10;
			
			if(sum<9 && n==0)
				break;
		}
		
		
		System.out.println(sum);
		
	}

}
