package com.chitingwang.adapter;

import java.util.Collection;
import java.util.Vector;

//Adapter class implementation 1
public class CollectionCharacter extends Vector<Character> implements Collection<Character> {
	
	public CollectionCharacter(String a) {
		for(char c : a.toCharArray())
			add(c); //or this.add(c)
		
		//CollectionCharactor or Vector just act like a list. 
		//So it will add c into the CollectionCharactor list.
	}
	
}
