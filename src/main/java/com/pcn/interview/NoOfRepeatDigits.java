package com.pcn.interview;

import java.util.HashMap;
import java.util.Map;

public class NoOfRepeatDigits {
	
	
	public static void main(String[] args){
		
		int n = 11111111;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int m;
		
		while(n > 0){
			m = n%10;
			n=n/10;
			if(!map.containsKey(m))
				map.put(m, 1);
			else
				map.put(m, map.get(m)+1);
			
		}
		
		
		for(Integer i : map.keySet())
			System.out.println("Count of "+ i + " is : "+ map.get(i));
		
		
	}

}
