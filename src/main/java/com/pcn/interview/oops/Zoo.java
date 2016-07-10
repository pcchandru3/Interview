package com.pcn.interview.oops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zoo {
	
	
	
	Map<String, List<Animal>> cages = new HashMap<String, List<Animal>>();
	
	
	public void createCage(String sCageName) {
		
		if(!cages.containsKey(sCageName))
			this.cages.put(sCageName, null);
		else
			System.out.println(sCageName + " already exists");
			
		
		
	}
	
	
	
	public boolean addAnimalToCage(Animal animal, String sCageName) {
		
		boolean flag = true;
		List<Animal> a = new ArrayList<Animal>();
		
		if(!this.cages.containsKey(sCageName)){
			createCage(sCageName);
			a.add(animal);
			
			this.cages.put(sCageName, a);
			System.out.println(animal.Name + " has been added to cage "+ sCageName);
			return true;
		}
		else{
			
			
			
			if(this.cages.get(sCageName)==null){
				
				a.add(animal);
				this.cages.put(sCageName, a);
				System.out.println(animal.Name + " has been added to cage "+ sCageName);
				return true;
			}
			else{
				a = this.cages.get(sCageName);
				for(Animal aa : a){
					
					if(!animal.sCompatible.contains(aa.Name)){
						System.out.println(animal.Name + " is  not conpatible in cage " + sCageName);
						flag = false;
						break;
					}
				}
				
				
				if(flag){
					a.add(animal);
					this.cages.put(sCageName, a);
					System.out.println(animal.Name + " has been added to cage "+ sCageName);
				}
			}
			
		}
			
		return flag;
		
		
	}
	
	
	
	
	public static void main(String[] args){
		
		
		Zoo zoo = new Zoo();
		zoo.createCage("Cage1");
		zoo.createCage("Cage2");
		zoo.createCage("Cage1");
		
		List<String> ls = new ArrayList<String>();
		ls.add("cat");
		ls.add("goat");
		ls.add("cow");
		
		Animal dog = new Animal("dog", ls);
		
		
		ls.clear();
		ls.add("dog");
		ls.add("goat");
		ls.add("cow");
		
		Animal cat = new Animal("cat", ls);
		
		ls.clear();
		ls.add("dog");
		ls.add("lion");
		ls.add("fox");
		
		Animal tiger = new Animal("tiger", ls);
		
		
		
		ls.clear();

		
		Animal fish = new Animal("fish", ls);
		
		
		
		
		zoo.addAnimalToCage(dog, "Cage1");
		zoo.addAnimalToCage(cat, "Cage1");
		zoo.addAnimalToCage(tiger, "Cage1");
		zoo.addAnimalToCage(tiger, "Cage2");
		zoo.addAnimalToCage(dog, "Cage2");
		zoo.addAnimalToCage(tiger, "Cage3");
		zoo.addAnimalToCage(dog, "Cage3");
		zoo.addAnimalToCage(cat, "Cage3");
		zoo.addAnimalToCage(fish, "Cage3");
		
		
		zoo.addAnimalToCage(fish, "Cage4");
		zoo.addAnimalToCage(cat, "Cage4");
	}

}
