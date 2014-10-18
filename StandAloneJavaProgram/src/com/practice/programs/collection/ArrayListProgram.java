package com.practice.programs.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListProgram {

	public static void main(String[] args) {
		
		List<String> list= new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		System.out.println("Array Size : " + list.size());
		
		//using for loop
		for(String s: list){			
			System.out.println("\n"+s);
		}
		
		Iterator i=list.iterator();
		
		//using iterator
		while(i.hasNext()){			
			System.out.println("\n"+ i.next());
		}
		
		
		

	}

}
