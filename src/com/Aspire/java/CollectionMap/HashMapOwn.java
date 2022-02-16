package com.Aspire.java.CollectionMap;

import java.util.HashMap;

public class HashMapOwn 
{
	public static void main(String[] args) 
	{			//key,	value
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(1, 100);
		hm.put(2, 50);
		hm.put(3, 100);
		hm.put(4, 70);
		hm.put(5, 100);
		hm.put(6, 100);
		hm.put(7, 20);
		int a=70;
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.containsValue(a));
		System.out.println(hm.containsKey(8));
		System.out.println(hm.get(4));
		hm.remove(6);
		hm.remove(7, 100);
		hm.put(9, 500);
		hm.put(5, 90);
		hm.replace(1, 10);
		hm.replace(2, 50, 60);
		hm.put(6, 200);
//		hm.put("Aspire", "M&A Testing");
		System.out.println(hm);
	}
}
