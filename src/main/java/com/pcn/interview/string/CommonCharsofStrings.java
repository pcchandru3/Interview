package com.pcn.interview.string;

import java.util.Hashtable;

public class CommonCharsofStrings {

	
	public static void main(String[] args){
		
		String s1="testoce";
		String s2 = "costcote";
		
		
		
		Hashtable<Character,Boolean> t = new Hashtable<Character, Boolean>();
		
		for(int i=0;i<s1.length(); i++){
			if(!t.containsKey(s1.charAt(i)))
				t.put(s1.charAt(i), false);
		}
		
		
		
		for(int i=0;i<s2.length();i++){
			if(t.containsKey(s2.charAt(i)))
				t.put(s2.charAt(i), true);
		}
		
		
		String s="";
		
		for(Character c : t.keySet())
			if(t.get(c) == true)
				s += c;
		
		
		System.out.println(s);
		
	}
}
