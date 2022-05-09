package com.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class Test1 {

	public static void main(String[] args) {
		TreeSet<String>ts=new TreeSet<String>(new Mycomp());
		ts.add("anu");
		ts.add("durga");
		ts.add("srawya");
		ts.add("ramu");
		System.out.println(ts);
		
		
		TreeSet<Integer>ts1=new TreeSet<Integer>(new Mycomp1());
		ts1.add(11);
		ts1.add(22);
		ts1.add(33);
		System.out.println(ts1);
	}

}
class Mycomp implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return -s1.compareTo(s2);
	}
	
}



class Mycomp1 implements Comparator<Integer>{
	


	@Override
	public int compare(Integer i1, Integer i2) {
		return -i1.compareTo(i2);  // 
	}
}