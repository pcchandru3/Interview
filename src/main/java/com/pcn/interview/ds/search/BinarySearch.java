package com.pcn.interview.ds.search;

import org.junit.Test;

public class BinarySearch {

	@Test
	public int binarySearch(int[] a) {
		
		
		int search = 30;
		boolean found = false;
		
		int low=0, mid=-1, high=a.length-1;
		while(low<=high){
			mid = low + (high - low) /2;
			if(a[mid] == search){
				System.out.println(mid);
				found = true;
				break;
			}
			else if(a[mid] < search)
				low++;
			else
				high--;
			
		}
		
		
		if(!found)
			mid=-1;
		
		return mid;
		
		
	}
	
	
	
	public static void main(String[] args){
		int[] a={10,20,30,40,50};
		BinarySearch b = new BinarySearch();
		System.out.println(b.binarySearch(a));
		
		
		
		
		
	}
	
	
}
