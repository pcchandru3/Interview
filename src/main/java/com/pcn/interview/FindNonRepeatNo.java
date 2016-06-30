package com.pcn.interview;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Map.Entry;

import org.junit.Test;

public class FindNonRepeatNo {

	
	
	@Test
	public void findNoRepeatNO() {
		int[] a = {1,2,1,2,4,2,3,4,4,5,5,5,5,4,6,5,6};
		
		Hashtable<Integer,Integer> h = new Hashtable<Integer,Integer>();
		
		for(int i=0; i<a.length;i++){
			if(!h.containsKey(a[i]))
				h.put(a[i], 1);
			else
				h.put(a[i], h.get(a[i]) + 1);
			
		}
		
		//HashMap<int, int> m = new HashMap<int,int>();
		
		
		for(int i : h.keySet()){
			if(h.get(i) == 1)
				System.out.println("non repeating no " + i);
		}
		
		
		
		
		// max repeated no
		int max = Collections.max(h.values());
		for(int i : h.keySet()){
			if(h.get(i) == max)
				System.out.println("max " + i +" "+ h.get(i));
		}
		
		
		
		Integer m =null;
		
		for(int i : h.keySet()){
			if(m==null || h.get(i) > m)
				m=h.get(i);
		}
		System.out.println("max using " + m);
		
	}
	
	
}
