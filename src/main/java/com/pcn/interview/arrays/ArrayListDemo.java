package com.pcn.interview.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
	
	public static void main(String[] args){
		
		
		List<String> list = new ArrayList<String>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		
		
		
		if(list.contains("threeh"))
			System.out.println("found");
		else
			System.out.println("Not found");
		
		
		
		
		
	}
	
	

}
