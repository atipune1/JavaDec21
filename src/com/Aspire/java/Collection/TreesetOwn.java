package com.Aspire.java.Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetOwn 
{
	public static void main(String[] args) {
		TreeSet tr = new TreeSet<>();
		tr.add("Ajay");			//String
		tr.add("Pranali");	
		tr.add("Mahesh");
		tr.add("Roshan");
		tr.add("Pranali");	
		tr.add("Sushil");
		tr.add("Sangram");
		tr.add("Reshma");	
		tr.add("Nanda");
		tr.add("Isha");
		System.out.println(tr);
		//for each loop		
				System.out.println("For each");
				for(Object temp:tr)
				{
					System.out.print(temp+"  ");
				}
		//iterator
				System.out.println();
				System.out.println("Iterator cursor");
				Iterator itr = tr.iterator();
				while(itr.hasNext())
				{
					System.out.print(itr.next()+ "  ");
				}
	}
}
