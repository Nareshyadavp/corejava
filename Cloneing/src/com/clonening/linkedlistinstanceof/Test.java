package com.clonening.linkedlistinstanceof;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public class Test {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		System.out.println(ll instanceof List);
		System.out.println(ll instanceof Cloneable);
		System.out.println(ll instanceof Serializable);
		System.out.println(ll instanceof RandomAccess); // false
		
		 
	}

}
