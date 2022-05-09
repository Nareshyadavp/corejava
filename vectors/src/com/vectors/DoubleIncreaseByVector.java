package com.vectors;

import java.util.ArrayList;
import java.util.Vector;

public class DoubleIncreaseByVector {

	public static void main(String[] args) {
		ArrayList<String>arrayList=new ArrayList<String>();
		arrayList.add("aaa");
		arrayList.add("aaa");
		arrayList.add("ccc");
		
		
		Vector<String> vector = new Vector<String>(arrayList);
 		vector.add("rathan");
		vector.add("anu");
		vector.add("durga");
		System.out.println(vector);
		 
	}

}
