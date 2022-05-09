package com.map.sorted;

import java.util.Comparator;
import java.util.TreeMap;

public class Test1 {

	public static void main(String[] args) {
		TreeMap<String,Integer>tm= new TreeMap<String,Integer>();
		tm.put("Annu",111);
		tm.put("ram",444);
		tm.put("raj",666);
		tm.put("anna",555);
		tm.put("jyothi",333);
		tm.put("ramana",999);
		System.out.println(tm);
	}

}
class MyComp implements Comparator<Integer>{  //mycomparator

	@Override
	public int compare(Integer i1, Integer i2) {
		return -i1.compareTo(i2);
	}
	
}