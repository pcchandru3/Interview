package com.pcn.interview;

public class StringFunctions {
	
	
	public static void main(String[] args){
		
		String s = "stringinsert";
		
		StringBuilder sb = new StringBuilder(s);
		
		sb.insert(5,"test");
		
		System.out.println(sb);
		
		
		
		System.out.println(s.contains("ingin"));
		
	}
	
	
	

}
