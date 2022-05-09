package com.set.parenttochild;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
Set<String>s=new HashSet<String>();   // parent hold child objest
s.add("rathan");
s.add("durga");
s.add("anu");
System.out.println(s);



ArrayList<String> al=new ArrayList<String>();
al.add("rathan");
al.add("durga");
al.add("rathan");


HashSet<String> hs=new HashSet<String>(al);
System.out.println(hs);

	}

}
