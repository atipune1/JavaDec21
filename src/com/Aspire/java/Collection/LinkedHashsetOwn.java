package com.Aspire.java.Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetOwn 
{
	public static void main(String[] args) 
	{
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("Ajay");			//String
		lhs.add("Shinde");	
		lhs.add(987654321);		//Integer
		lhs.add("Barshi");
		lhs.add(null);
		lhs.add('A');
		lhs.add(95.45f);
		lhs.add(true);
		lhs.add(null);
		lhs.add(null);
		lhs.add("Ajay");
		System.out.println(lhs);
		
		//for each loop		
				System.out.println("For each");
				for(Object temp:lhs)
				{
					System.out.print(temp+"  ");
				}
		//iterator
				System.out.println();
				System.out.println("Iterator cursor");
				Iterator itr = lhs.iterator();
				while(itr.hasNext())
				{
					System.out.print(itr.next()+ "  ");
				}		
	}
}
