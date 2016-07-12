package com.pcn.interview;

import org.junit.Test;

public class UniqueStringChars {
	
	
	
	
	
	public boolean isUniqueChars(String s) {
		boolean flag = true;
		
		boolean[] char_set = new boolean[256];
		int val=0;
		
		// to ignore case
		//s = s.toLowerCase();
		
		
		
		if(s.length() > char_set.length)
			return false;
		
		for (int i = 0; i < s.length(); i++) {
			val = s.charAt(i);
			
			// to ignore space
			if(val ==32)
				continue;
			if(char_set[val])
				return false;
			char_set[val] = true;
		}

		return flag;
		
	}
	
	
	
	public boolean isUniqueChars2(String str) {
		
		 int checker = 0;
		 for (int i=0; i < str.length(); i++) {
		 int val = str.charAt(i) - 'a';
		
		if ((checker & (1 << val)) > 0) {
		 return false;
		 }
		 checker |= (1 << val);
		 }
		 return true;
		 }
	
	
	
	
	
	public static boolean isEven (int num) {
		
		num = 3;
		
	    return (num & 1) == 0;
	}
	
	
	
	public void compareBitWise(){
		int a=60;
		int b=130;
		
		
		if((a & b) < a && (a & b) < b)
			System.out.println("a is big");
		else
			System.out.println("b is big");
		
		
		
		if((a^b) > 0)
			System.out.println("a is big");
		else
			System.out.println("b is big");
		
		
		
		
	}
	
	
	
	
	
	
	
	
	@Test
	public void runTest(){
		//System.out.println(isUniqueChars("this   IS  "));

		//isUniqueChars2("this IS ");
		
		//compareBitWise();
		
		isEven(5);
		
		
		
		
	}
	
	
	

}
