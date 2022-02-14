package com.Aspire.java.Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedlistOwn 
{
	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList<>();
		System.out.println(ll.isEmpty());
		ll.add("Ajay");			//String
		ll.add("Shinde");	
		ll.add(987654321);		//Integer
		ll.add("Barshi");
		ll.add(null);
		ll.add('A');
		ll.add(95.45f);
		ll.add(true);
		ll.add(null);
		ll.add(null);
		ll.add("Ajay");
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.indexOf("Barshi"));
		System.out.println(ll.lastIndexOf(null));
		ll.add(5, "Dist. Solapur");
		ll.remove(4);
		ll.set(4, "Solapur");
		System.out.println(ll);
//for
		for(int i=0; i<=ll.size()-1; i++)
		{
			System.out.print(ll.get(i)+"  ");
		}
		System.out.println();
		Object name = ll.get(0);
		System.out.println(name);
		
//for each
		System.out.println();
		System.out.println("For each loop");
		for(Object aspire:ll)
		{
			System.out.print(aspire+"  ");
		}
//iterator
		System.out.println();
		System.out.println("Iterator cursor");
		Iterator itr = ll.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+"  ");
		}
//listiterator
		System.out.println();
		System.out.println("List iterator in forward direction");
		ListIterator litr = ll.listIterator();
		while(litr.hasNext())
		{
			System.out.print(litr.next()+" ");
		}
		System.out.println();
		System.out.println("List iterator in reverse direction");
		ListIterator litr2 = ll.listIterator(ll.size());
		while(litr2.hasPrevious())
		{
			System.out.print(litr2.previous()+"  ");
		}
//enumeration --> x
	}
}
