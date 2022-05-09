package com.cursor.enumeration;

import java.util.Enumeration;

import java.util.Vector;

public class EnumerationCursors {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
		vector.add("rathan");
		vector.add("durga");
		vector.add("anu");
		vector.add("aarya");

		// Read the data by using Enumeration:normal version
		// by using elements()
		Enumeration e = vector.elements();
		while (e.hasMoreElements()) {
			String s = (String) e.nextElement();
			System.out.println(s);
		}

		// Read the data by using Enumeration: Generic version
		Enumeration<String> e1 = vector.elements();
		while (e1.hasMoreElements()) {
			String s = e1.nextElement();
			System.out.println(e1);
		}
	}
}
