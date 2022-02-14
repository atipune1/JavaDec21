package com.Aspire.java.SuperThis;

public class Child extends Parent
{
	int a=700;
	int b=50;
	int c=100;
	public void m1()
	{
		int a=1000;
		System.out.println(a);			//1000
		System.out.println(this.a);		//
		System.out.println(super.a);	//10
//		System.out.println(b);
//		System.out.println(c);
	}
	
	public static void main(String[] args) {
		Child ch= new Child();
		ch.m1();
		int z=10;
	}
	
}
