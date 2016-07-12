package com.pcn.interview;

import java.util.Hashtable;

import org.junit.Test;

public class FindSubString {

	
	
	@Test
	public void fnidSubString() {
		
		String s = "This is a test for finding sub string in a string";
		String s1 = "sub";
		
		String[] a = s.split(" ");
		Hashtable h = new Hashtable<String, Integer>();
		int k=0;
		
		for(int i=0;i<a.length;i++){
			if(i!=0)
				k = k + a[i-1].length()+1;
			
			h.put(a[i], k);
			
			
//			else{
//				
				//h.put(a[i], k);
			//}
				
		}
		
		
		System.out.println(h.get(s1));
		
		
		System.out.println("Thisisatestforfindingsubstringinastring".substring(6,5));
		
		
		s = "Thisisatestforfindingsubstringinastring";
		System.out.println(s.substring(6, 3));
		
		
		
		
	}
}
