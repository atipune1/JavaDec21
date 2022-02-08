package com.Aspire.java.LogicalProg;
//int[] a={2,7,6,8,1,9,15,25,17,22}
//Sum & Average
public class ArraysSum 
{
	public static void main(String[] args) 
	{
		int[] a={2,7,6,8,1,2,9,15,25,17,24};
		int sum=0;
		float avg;
		for(int i=0; i<a.length;i++)
		{
			sum=sum+a[i];	
		}
		avg=sum/a.length;
		System.out.println("Sum of all elements from array="+sum);
		System.out.println("Average of all elements in array="+avg);
	}
}
