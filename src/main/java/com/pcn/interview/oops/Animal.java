package com.pcn.interview.oops;

import java.util.ArrayList;
import java.util.List;

public class Animal {
	String Name;
	List<String> sCompatible = new ArrayList<String>();
	
	
	Animal(String sName, List<String> sCompatible){
		this.Name = sName;
		this.sCompatible.addAll(sCompatible);
		
	}
	
	
}
