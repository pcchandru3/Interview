package com.pcn.interview.ds.sort;

public class BubbleSort {
	
	public BubbleSort(int[] a){
		this.a = a;
	}
	
	int[] a ;
	
	public void bubbleSort(){
		for(int i=0; i<a.length;i++){
			for(int j=0; j<a.length-1;j++){
				if(a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
					
			}
		}
	}
	
	
	
	public void print() {
		for(int i=0;i<a.length;i++){
			System.out.print(a[i] +" ");
		}
	}
	
	public static void main(String[] args){
		
		int[] a = {4,5,3,6,1,7,2,9,8};
		BubbleSort b = new BubbleSort(a);
		
		b.bubbleSort();
		
		b.print();
		
	}
	

}
