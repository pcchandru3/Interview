package com.pcn.interview.oops;

import java.util.ArrayList;
import java.util.List;


public class Cage {
	String CageName;
	List<Animal> animals = new ArrayList<Animal>();
	
	Cage(String sCageName){
		this.CageName = sCageName;
	}
	
}
