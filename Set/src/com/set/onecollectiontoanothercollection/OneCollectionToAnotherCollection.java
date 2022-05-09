package com.set.onecollectiontoanothercollection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class OneCollectionToAnotherCollection {

	public static void main(String[] args) {
LinkedHashSet<String> lhs=new LinkedHashSet<String>();
lhs.add("ramu");
lhs.add("ramana");
lhs.add("ravana");
HashSet<String> hs=new HashSet<String>(lhs);
hs.add("amma");
hs.add("nanna");
System.out.println(hs);

HashSet<String> hs1=new HashSet<String>( );
hs1.add("amma");
hs1.add("nanna");

HashSet<String> hs2=new HashSet<String>( );
hs2.add("thammudu");
hs2.add("akka");

HashSet<String> hs3=new HashSet<String>( );
hs3.add("family");
hs3.add("members");
hs3.addAll(hs1);
hs3.addAll(hs2);
System.out.println(hs3);

	}

}
