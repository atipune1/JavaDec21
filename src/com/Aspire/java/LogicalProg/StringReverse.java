package com.Aspire.java.LogicalProg;

public class StringReverse 
{
	public static void main(String[] args) 
	{
	String s1="Aspire Training Institute Pune";
//character reverse -->enuP etutitsnI gniniarT eripsA

	
	String[] sa1 = s1.split("");
	for(int i=sa1.length-1; i>=0;i--)
	{
		System.out.print(sa1[i]);
	}
//word reverse		-->Pune Institute Training Aspire	
	System.out.println();
	String[] sa2 = s1.split(" ");
	for(int j=sa2.length-1; j>=0; j--)
	{
		System.out.print(sa2[j]+" ");
	}
	}
}
