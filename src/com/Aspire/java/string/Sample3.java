package com.Aspire.java.string;

public class Sample3 
{
	public static void main(String[] args) 
	{
		String s1="aspire";
		String s2="Aspire";
		String s3="Training";
		String s4="Institute";
		String s5="Aspire Training Institute Pune";
//substring
		System.out.println(s1.substring(0));
		System.out.println(s5.substring(10));	//including mentioned index number all characters towards right side
		System.out.println(s1.substring(2, 5)); //1st -include but 2nd-exclude
		System.out.println(s5.substring(7, 15));
		System.out.println(s5.substring(0,s5.length()));
//concat
		String s10 = s2+s3;				
		System.out.println(s2+s3);
		String s = s2.concat(s3);		
		System.out.println(s.length());
//replace//cdafjhdgf251546%$%$$54AHFA5454-->number/lowercase
		String s6 = s2.replace("spire", "SPIRE");
		System.out.println(s2);
		System.out.println(s6);
//split
		String[] sar = s5.split("i");
		System.out.println(s5.length());	//30-String length
		System.out.println(sar.length);		//4-array length
		for(int i=0; i<=sar.length-1; i++)  
		{
			System.out.println(sar[i]+" ");
		}
	}
}
