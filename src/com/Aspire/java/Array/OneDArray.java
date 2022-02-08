package com.Aspire.java.Array;

import java.util.Arrays;

public class OneDArray 
{
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,60}; //length 6 (index =0-5)
		int[] b= new int[8];
		String[] c= new String[4];
		b[0]=3;
		b[1]=5;
		b[2]=3;
		b[3]=50;
		b[4]=7;
		b[5]=12;
		b[6]=9;
		b[7]=10;
		c[0]="Aspire";
		c[1]="Training";
		c[2]="Institute";
		c[3]="Pune";
		int sum=a[2]+b[3];
		System.out.println(sum);
		System.out.println("Length of a[] ="+a.length); //6
		System.out.println("Length of b[]="+b.length);	//8
		
		for(int i=0; i<=b.length-1;i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println();
		System.out.println("Arrays Sorted");
		Arrays.sort(b);
		for(int j=0; j<b.length; j++)
		{
			System.out.print(b[j]+" ");
		}
		System.out.println();
		System.out.println("Sorting in reverse order");
		for(int k=b.length-1; k>= 0; k--)
		{
			System.out.print(b[k]+" ");
		}
	}
}
