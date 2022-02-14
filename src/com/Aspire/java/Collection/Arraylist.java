package com.Aspire.java.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//duplicate allow
//null values-no limit
//data type - any
public class Arraylist 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList<>();
		System.out.println(al.isEmpty());
		al.add("Ajay");			//String
		al.add("Shinde");	
		al.add(987654321);		//Integer
		al.add("Barshi");
		al.add(null);
		al.add('A');
		al.add(95.45f);
		al.add(true);
		al.add(null);
		al.add(null);
		al.add("Ajay");
		System.out.println(al);   //order of insertion maintain
//		System.out.println(al.size());
//		System.out.println(al.isEmpty());
//		System.out.println(al.indexOf("Ajay"));
//		System.out.println(al.lastIndexOf("Ajay"));
		
		al.add(1, "Sunil");
		al.remove(11);
		al.set(6, 'Z');
		System.out.println(al);
		System.out.println(al.get(3));
		System.out.println("With for loop");
//for loop		
		for(int i=0; i<al.size(); i++)
		{
			System.out.print(al.get(i)+"  ");
		}
		System.out.println();
		System.out.println("With for each loop");
//for each loop
		for(Object temp:al)		//for(Datatype   tempVariable :source) { }
		{
			System.out.print(temp+ "  " );
		}
		System.out.println();
		System.out.println("With while loop");
//While
		int i=0;
		while(i<al.size())
		{
			System.out.print(al.get(i)+"  ");
			i++;
		}
		System.out.println();
		System.out.println("Iterator cursor");
//iterator
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+"  ");
		}
		System.out.println();
		System.out.println("ListIterator cursor- in forward direction");
//listiterator
		ListIterator litr = al.listIterator();
		while(litr.hasNext())
		{
			System.out.print(litr.next()+"  ");
		}
		System.out.println();
		System.out.println("ListIterator cursor- in reverse direction");
		ListIterator litr2 = al.listIterator(al.size());
		while(litr2.hasPrevious())
		{
			System.out.print(litr2.previous()+"  ");
		}
//Enumeration cursor-->it will not work for Arraylist
	}
}
