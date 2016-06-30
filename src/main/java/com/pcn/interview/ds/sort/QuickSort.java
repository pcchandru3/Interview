package com.pcn.interview.ds.sort;

public class QuickSort {
	
	
	public int[] a;
	
	
	
	QuickSort(int[] x){
		a = x;
		
	}
	public void quickSort(int low, int high){
		
		int i=low, j=high;
		
		int pivot = a[low + (high - low)/2];
				//a[high];
				//a[low + (high - low)/2];
		
		while(a[i] < pivot)
			i++;
		
		while(a[j] > pivot)
			j--;
		
		if(i<=j){
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		
		for(int c:a){
            System.out.print(c);
            System.out.print(" ");
        }
		
		
		System.out.print("\n ");
		
		if(low < j)
			quickSort(low, j);
		if(high > i)
			quickSort(i,high);
		
	}
	
	
	
	public static void main(String a[]){
        
        int[] input = {24,2,45,20,56,75,2,56,99,53,12};
        QuickSort sorter = new QuickSort(input);
        
        
        sorter.quickSort(0, sorter.a.length-1);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }
    }
	
	

}
