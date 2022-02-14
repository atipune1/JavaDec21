package com.Aspire.java.Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector1 
{
	public static void main(String[] args) 
	{
		Vector v = new Vector();
		System.out.println(v.isEmpty());
		v.add("Ajay");			//String
		v.add("Shinde");	
		v.add(987654321);		//Integer
		v.add("Barshi");
		v.add(null);
		v.add('A');
		v.add(95.45f);
		v.add(true);
		v.add(null);
		v.add(null);
		v.add("Ajay");
		System.out.println(v);   //order of insertion maintain
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.indexOf("Ajay"));
		System.out.println(v.lastIndexOf("Ajay"));
		
		v.add(1, "Sunil");
		v.remove(11);
		v.set(6, 'Z');
		System.out.println(v);
		System.out.println(v.get(3));
		System.out.println("With for loop");
//for loop		
		for(int i=0; i<v.size(); i++)
		{
			System.out.print(v.get(i)+"  ");
		}
		System.out.println();
		System.out.println("With for each loop");
//for each loop
		for(Object temp:v)		//for(Datatype   tempVariable :source) { }
		{
			System.out.print(temp+ "  " );
		}
		System.out.println();
		System.out.println("With while loop");
//While
		int i=0;
		while(i<v.size())
		{
			System.out.print(v.get(i)+"  ");
			i++;
		}
		System.out.println();
		System.out.println("Iterator cursor");
//iterator
		Iterator itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+"  ");
		}
		System.out.println();
		System.out.println("ListIterator cursor- in forward direction");
//listiterator
		ListIterator litr = v.listIterator();
		while(litr.hasNext())
		{
			System.out.print(litr.next()+"  ");
		}
		System.out.println();
		System.out.println("ListIterator cursor- in reverse direction");
		ListIterator litr2 = v.listIterator(v.size());
		while(litr2.hasPrevious())
		{
			System.out.print(litr2.previous()+"  ");
		}
////Enumeration cursor-->
		System.out.println();
		System.out.println("With Enumeration cursor");
		Enumeration en = v.elements();
		while(en.hasMoreElements())
		{
			System.out.print(en.nextElement()+"  ");
		}
	}
}
