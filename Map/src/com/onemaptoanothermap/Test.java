package com.onemaptoanothermap;

import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		TreeMap<String,Integer>tm= new TreeMap<String,Integer>();
		tm.put("Annu",111);
		tm.put("ram",222);
		tm.put("raj",333);
		// Calling One constructormap to another Constructormap
		TreeMap<String,Integer>tm1= new TreeMap<String,Integer>(tm);
		tm1.put("thammusu", 444);
		System.out.println(tm1);
		
		TreeMap<String,Integer>tm2= new TreeMap<String,Integer>();
		tm2.put("Annu",111);
		tm2.put("kambagiri",222);
		tm2.put("amma",333);// only one object
		
		TreeMap<String,Integer>tm3= new TreeMap<String,Integer>();
		tm3.put("nareh", 777);
		TreeMap<String,Integer>tm4= new TreeMap<String,Integer>();
		tm4.put("nanna", 999);
		tm4.putAll(tm2);
		tm4.putAll(tm3); // it used to entire map
		System.out.println(tm4);


	}

}
