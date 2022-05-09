package com.treeset;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
TreeSet<String>ts=new TreeSet<String>();
ts.add("anu");
ts.add("durga");
ts.add("srawya");
ts.add("ramu");
System.out.println(ts);

TreeSet<Integer>ts1=new TreeSet<Integer>();
ts1.add(11);
ts1.add(22);
ts1.add(33);
System.out.println(ts1);
	
TreeSet t=new TreeSet();
t.add(1);
t.add("rathan");
System.out.println(t); // compile cast Exception


TreeSet t1=new TreeSet();
t1.add(2);
t1.add("rathan");
t1.add(null);
System.out.println(t1);// null pointer
	}

}
