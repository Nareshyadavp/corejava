package com.set;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("rathan");
		hs.add("ram");
		hs.add("ravana");
		hs.add("anu");
	//	hs.add(10);
		System.out.println(hs);

		HashSet<String> hs1 = new HashSet<String>();
		System.out.println(hs1.add("rathan"));

		System.out.println(hs1.add("rathan"));
		System.out.println(hs1);

	}
}