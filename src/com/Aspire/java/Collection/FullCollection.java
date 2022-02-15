package com.Aspire.java.Collection;

import java.util.ArrayList;

public class FullCollection 
{
	public static void main(String[] args) 
	{
		int[] a= {54,21,54,89,212,7,265,4,5,65};
		String[] b= {"Ajay","Pranali","Roshan","Pranali", "Nanda"};
		float[] c= {2.5f,2.9f, 56.5f, 2.5f, 5.5f};
		int d=20;
		
		System.out.println("********Arraylist*********");
		ArrayList al = new ArrayList<>();
		for(int i=0; i<a.length; i++)
		{
			al.add(a[i]);
		}
		for(int j=0; j<b.length;j++)
		{
			al.add(b[j]);
		}
		al.add(d);
		System.out.println(al);	
		
		
		System.out.println("********Vector*********");
		System.out.println("********Linkedlist*********");
		System.out.println("********Hashset*********");
		System.out.println("********LinkedHashset*********");
		System.out.println("********Treeset*********");
	}
}
