package com.pcn.interview.string;

import org.junit.Test;

public class StringReverse {
	
	
	public String strReverse(String str){
		String strReverse="";
		for(int i=str.length()-1; i>=0; i--){
			strReverse+=str.charAt(i);
		}
		
		return strReverse;
	}
	
	
	
	
	
	public String strReverse2(String str){
		String strReverse="";
		
		
		int start=str.length()-1;
		int end = str.length()-1;
		
		while(start>=0){
			if(start==0)
				strReverse = strReverse + " " +  str.substring(start, end+1);
			
			else if(str.charAt(start) == ' '){
				strReverse = strReverse + " " + str.substring(start+1, end+1);
				end = start-1;
				
			}
			start--;
			
		}
		
		return strReverse.trim();
	}
	
	
	
	@Test
	public void test(){
		System.out.println(strReverse("we am a boy"));
		
		System.out.println(strReverse2("we am a boy"));
	}
	
	

}
