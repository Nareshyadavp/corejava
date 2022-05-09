package com.map.sorted;

import java.util.SortedMap;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		TreeMap<Integer,String>tm= new TreeMap<Integer,String>();
		 tm.put(1, "rathan");
		 tm.put(20, "ram");
		 tm.put(40, "durga");
		 tm.put(10, "anna");
		 tm.put(2, "thammudu");
		 tm.put(30, "rathan");
		 System.out.println(tm);

			SortedMap<Integer,String>sm= tm.subMap(2, 30);
TreeMap<Integer,String>tm1=new TreeMap<Integer,String>(sm);
		System.out.println(tm1);
		
		SortedMap<Integer,String>sm1= tm.tailMap(10);
TreeMap<Integer,String>tm2=new TreeMap<Integer,String>(sm1);
	System.out.println(tm2);

	SortedMap<Integer,String>sm2= tm.tailMap(10);
TreeMap<Integer,String>tm3=new TreeMap<Integer,String>(sm2);
System.out.println(tm3);

	}

}
