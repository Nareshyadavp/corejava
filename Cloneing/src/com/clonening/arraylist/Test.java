package com.clonening.arraylist;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("naresh");
		al.add("kumar");
		al.add("yadav");

		ArrayList<String> copy = (ArrayList<String>) al.clone(); // by cloneing
		System.out.println(copy);

	}

}
