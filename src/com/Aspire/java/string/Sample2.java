package com.Aspire.java.string;

public class Sample2 
{
	public static void main(String[] args) 
	{
		String s1="aspire";
		String s2="Aspire";
		String s3="ASPIRE";
				// 012345 -->length= highest index+1
		String s4="Aspire Training Institute Pune";
		String s5="";
		System.out.println(s1.equals(s2));  			//false
		System.out.println(s1.equalsIgnoreCase(s2));	//true
		System.out.println(s1.equalsIgnoreCase(s3)); 	//true			
		System.out.println(s3.length());				//6
		System.out.println(s4.length());				//30
		System.out.println(s4.contains(s2)); 			//true
		System.out.println(s5.isEmpty());				//true
		System.out.println(s4.isEmpty());				//false
		System.out.println(s3.charAt(3));				//I
		System.out.println(s4.charAt(20));				//i
		System.out.println(s4.indexOf('n'));			//11 always print 1st index of character
		System.out.println(s4.lastIndexOf('i')); 		//20 1st index in reverse direction
		System.out.println(s4.startsWith(s2));			//true
		System.out.println(s4.startsWith("Asp"));		//true
		System.out.println(s4.endsWith("ne")); 	    	//true
		System.out.println(s4.toLowerCase());			//aspire training institute pune
		System.out.println(s4.toUpperCase());			//ASPIRE TRAINING INSTITUTE PUNE
		System.out.println((s4.toLowerCase()).startsWith("asp"));	//true
		System.out.println((s4.toUpperCase()).contains(s3));		//true
	}
}
