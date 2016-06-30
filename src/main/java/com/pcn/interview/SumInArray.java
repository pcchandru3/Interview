package com.pcn.interview;

import java.util.Hashtable;

public class SumInArray {
	
	
	public static void main(String[] args) {
		
		boolean found = false;
		Integer[] a = {1,4,45,6,10,8};
		
		int n =550;
		
		int k=0;
		
		for(int i=0;i<a.length-1; i++){
			
			int find = n - a[i];
			
			
			for(int j=i+1; j<a.length; j++){
				k++;
				if(find ==  a[j]){
					System.out.println("match found ");
					found = true;
					break;
				}
			}
			if(found)
				break;
			
		}
		
		if(!found)
			System.out.println("not found");
		
		System.out.println("no of iterations"+ k);
		
		
		
		
		
		
		
		
		// if the array is sorted
		int[] b = {1,4,6,8,10,45};
		k=0;
		for(int i=0, j=a.length-1; i < j; ){
			
			k++;
			if(b[i]+b[j] == n){
				System.out.println("====match found ");
				found = true;
				break;
			}
				
			
			if(b[i] + b[j] < n)
				i++;
			else 
				j--;
			
			
		}
		

		if(!found)
			System.out.println("not found");
		
		System.out.println("no of iterations"+ k);
		
		
		
		
		
		
		
		
		
		// Using hashtable
		int[] c = {1,4,6,8,10,45};
		
		
//		15,1
//		12,4
//		10,6
//		8,8
//		6,10
//		-33,45
		
		
		k=0;
		Hashtable h = new Hashtable();
		for(int i=0;i<c.length;i++){
			k++;
			if((n-c[i]) != c[i])
				h.put(n-c[i], c[i]);
			
		}
		
		found=false;
		for(int i=0;i<c.length;i++){
			k++;
			if(h.containsKey(a[i])){
				System.out.println("Found : " + a[i] +" " + h.get(a[i]));
				found = true;
				break;
			}
		}
		
		
		
		if(!found)
			System.out.println("not found in hashtable");
		System.out.println("no of iterations in hash " + k);
		
		
	}
	
	
	
	
	
	
	
	
}
