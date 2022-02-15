package com.Aspire.java.Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetOwn 
{
	public static void main(String[] args) 
	{
		HashSet hs = new HashSet<>();
		hs.add("Ajay");			//String
		hs.add("Shinde");	
		hs.add(987654321);		//Integer
		hs.add("Barshi");
		hs.add(null);
		hs.add('A');
		hs.add(95.45f);
		hs.add(true);
		hs.add(null);
		hs.add(null);
		hs.add("Ajay");
		System.out.println(hs);
//for each loop		
		System.out.println("For each");
		for(Object temp:hs)
		{
			System.out.print(temp+"  ");
		}
//iterator
		System.out.println();
		System.out.println("Iterator cursor");
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+ "  ");
		}
	
	}
}
