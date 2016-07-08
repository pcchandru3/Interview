package com.pcn.interview.string;

import org.junit.Test;

public class ReverseStringUsingRecursion {
	
	
	public String reverse(String s){
		
		if(s.length()==0)
			return "";
		return s.charAt(s.length()-1) + reverse(s.substring(0, s.length()-1));
		
	}
	
	
	
	@Test
	public void test() {
		System.out.println(reverse("chalapathi"));
		
		
		
	}

}
