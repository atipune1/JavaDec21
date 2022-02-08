package com.Aspire.java.Array;

import java.util.Scanner;

public class ArraywithScaner 
{
	public static void main(String[] args) {
		int[] a= new int[5];		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value ");
		a[0]=scan.nextInt();
		a[1]=scan.nextInt();
		a[2]=scan.nextInt();
		a[3]=scan.nextInt();
		a[4]=scan.nextInt();
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Sum of user values from  array="+sum);
	}
}
