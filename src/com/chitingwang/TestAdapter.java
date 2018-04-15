package com.chitingwang;
import java.util.*;
import com.chitingwang.adapter.CollectionCharacter;

//This class will test whether the adapter class CollectionCharacter works will

public class TestAdapter{	
    
    public static void main(String[] args) {
        
        //The string input here will be converted to char and add to the CollectionCharacter list.
    	//See the constructor in the CollectionCharacter class
        
    	Collection<Character> collectionCharacter = new CollectionCharacter("abcdefg"); 

        // test 1 -- see if the contents are there

        for ( Character k : collectionCharacter )
            System.out.println( k );

        // test 2 -- check remove method

        System.out.println("----------collectionCharacter.remove()----------");
        collectionCharacter.remove( new Character('e'));
        for ( Character k : collectionCharacter)
            System.out.println( k );

        // test 3 -- check size, isEmpty, and contains methods
 
        System.out.println("----------collectionCharacter.contains()----------");
        System.out.println( "contains('g') = " + collectionCharacter.contains( new Character('g')));
        System.out.println( "size = " + collectionCharacter.size() + ", isEmpty = " + collectionCharacter.isEmpty());
    }

}