package com.pcn.interview.arrays;

public class LargestThree {
	
	
	public static void main(String[] args){
		
		int[] a = {1,1,1};
		
		int first=a[0], second=a[0], third=a[0];
		
		for(int i=1;i<a.length;i++){
			if(first < a[i]){
				third = second;
				second = first;
				first = a[i];
			}
			else if(second < a[i]){
				third = second;
				second = a[i];
			}
			else if (third < a[i])
				third = a[i];
			
		}
		
		System.out.println(first +" " + second +" " + third);
		
	}
	
	
	


}