package com.Aspire.java.oops.casting;

public class ImplicitCasting 
{
	public static void main(String[] args) 
	{
		System.out.println("Implicit Casting");
		byte a=127;
		short b=20;
		int c;
		c=a;
		int sum;
		sum=a+b;
		System.out.println(c);
		System.out.println("sum="+sum);
		
		
		System.out.println("Explicit casting");
		int i=1000000;
		short j=500;
		byte k;
		k=(byte)i;
		System.out.println(k); //-128-0-127 =256
		
		
		
	}
}
