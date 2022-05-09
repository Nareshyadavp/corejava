package com.linkedlist;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("anu");
		linkedList.add("rathan");
		linkedList.add("durga");
		linkedList.add("null");
		System.out.println(linkedList);  //anu,rathan,durga,null

		linkedList.addFirst("aaa");
		linkedList.addLast("bbb");
		System.out.println(linkedList);//aaa,bbb,anu,rathan,durga,null

		System.out.println(linkedList.size());//6

		linkedList.remove(1);
		linkedList.remove("rathan");
		linkedList.add("srawya");
		System.out.println(linkedList);//aaa,durga,null,bbb,srawya
		linkedList.set(1, "suri");
		System.out.println(linkedList.isEmpty());// fasle
		linkedList.clear();
		System.out.println(linkedList.isEmpty());  //true
	}

}
