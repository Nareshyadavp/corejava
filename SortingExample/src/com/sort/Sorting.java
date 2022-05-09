package com.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class Sorting {

	public static void main(String[] args) {
		
		//  case-1sorting :normal case
		ArrayList<String> al = new ArrayList<String>();
		al.add("rathan");
		al.add("annu");
		al.add("durga");
		al.add("srawya");
		System.out.println("Befor sorting:" + al);
		Collections.sort(al);
		System.out.println("After sorting:" + al);
		
		//by wrapper class
		// case-1-1 sorting :normal case
		LinkedList<Integer> lst = new LinkedList<Integer>();
		lst.add(10);
		lst.add(20);
		lst.add(90);
		lst.add(4);
		lst.add(5);
		System.out.println("Befor sorting" + lst);
		Collections.sort(lst);
		System.out.println("After sorting" + lst);
		/*
		 * 
		 * //case -2-CCE ArrayList al1 = new ArrayList(); al1.add("rathan");
		 * al1.add("annu"); al1.add(1); Collections.sort(al1); // compile time
		 * classcastException
		 * 
		 * 
		 * // case-3 NullPointerExeception Vector v=new Vector(); v.add(10); v.add(20);
		 * v.add(null); Collections.sort(v);
		 */		
	}

}
