package com.map.phonebook;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Clinet {

	public static void main(String[] args) {
		Map<String, String> phonebook = new HashMap<String, String>();
		phonebook.put("Naveen", "9898986663");
		phonebook.put("rammu", "9989833224");
		phonebook.put("lakshmi", "9298663322");
		phonebook.put("swarna", "6308762131");

		// names consider the keys,and numbers consider the value

		// if you know the key we will get the value(number)
		System.out.println(phonebook.get("rammu")); // getting value

		// i want to print all keys
		// it constains 2 ways
		// 1.Map also contains keySet()
		Set<String> keys = phonebook.keySet();
		for (String i : keys) {
			System.out.println(i + " " + phonebook.get(i));
		}

		// 2.MapEntry is interface in the map,map<> inside that we have interface
		// key and value pair consider the entiry
		Set<Map.Entry<String, String>> s = phonebook.entrySet(); // by using entrySet()
		for (Map.Entry<String, String> e : s) {
			System.out.println(e.getKey() + " " + e.getValue());

		}
	}

}
