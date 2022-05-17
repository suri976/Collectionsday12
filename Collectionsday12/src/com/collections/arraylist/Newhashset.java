package com.collections.arraylist;
import java.util.*;

public class Newhashset {
	
	public static void main(String[] args) {
		// default collections are generic wider or widest
		HashSet colours =new HashSet() ;
		colours.add("blue");
		colours.add("sky blue");
		colours.add("yellow");
		colours.add("green");
		colours.add("blue");
		colours.add("Red");
		System.out.println(colours);
		System.out.println(colours.size());
		System.out.println(colours.toString());
		
		//Iterator iter=colours.
		
		
		for( Object color:colours)
		{
			System.out.println(color);
			
		}
		
		
		
		
		
	}

	
	
}
