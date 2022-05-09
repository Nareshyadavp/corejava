package com.mapTreemap;

import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
TreeMap<String,Integer>tm= new TreeMap<String,Integer>();
tm.put("Annu",111);
tm.put("ram",222);
tm.put("raj",333);
tm.put("naresh",444);
System.out.println(tm);


TreeMap<Integer,String>tm1= new TreeMap<Integer,String>();
tm1.put(111, "annu");
tm1.put(222, "ram");
tm1.put(444, "naresh");   //based on keys
System.out.println(tm1);

	}

}
