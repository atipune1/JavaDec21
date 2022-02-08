package com.Aspire.java.oops.casting;

public class Test 
{
	public static void main(String[] args) 
	{
		System.out.println("Parent class object with Parent Reference");
		Parent p = new Parent();
		p.bunglow();
		p.car();
		p.farm();
		p.jwellary();
		System.out.println("a="+p.a);
		
		System.out.println("Child class object with Child Reference");
		Child c=new Child();
		c.bunglow();
		c.bike();
		c.car(); //inherited method
		c.farm();
		c.jwellary();
		System.out.println("a="+c.a);
		
		
		
		System.out.println("Child class object with Parent Reference");
		//WebDriver driver=new ChromeDriver();
		Parent pc=new Child(); //creating object of child class with reference to Parent class
		pc.bunglow();
		pc.car();
		pc.farm();
		pc.jwellary();
		System.out.println("a="+pc.a);
	}
}
