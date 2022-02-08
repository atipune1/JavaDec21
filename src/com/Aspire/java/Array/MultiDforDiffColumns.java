package com.Aspire.java.Array;

public class MultiDforDiffColumns 
{
	public static void main(String[] args) 
	{
		int[][] a= {{1,2,3,4,5},{5,6},{9,10,20,21,22,23,11,12},{13,14,15,16},{17,18,19}};
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
