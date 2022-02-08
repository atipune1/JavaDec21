package com.Aspire.java.Array;

public class MultiDArray 
{
	public static void main(String[] args) 
	{
		int[][] a= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};// rows=5, column=4
		int[][] b= new int[5][4];
		b[0][0]=1;
		b[0][1]=2;
		b[0][2]=3;
		b[0][3]=4;
		b[1][0]=5;
		b[1][1]=6;
		b[1][2]=7;
		b[1][3]=8;
		b[2][0]=9;
		b[2][1]=10;
		b[2][2]=11;
		b[2][3]=12;
		b[3][0]=13;
		b[3][1]=14;
		b[3][2]=15;
		b[3][3]=16;
		b[4][0]=17;
		b[4][1]=18;
		b[4][2]=19;
		b[4][3]=20;
		for(int i=0; i<5; i++) //rows-outer for loop
		{
			for(int j=0; j<4; j++)	//column-inner for loop
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
}
