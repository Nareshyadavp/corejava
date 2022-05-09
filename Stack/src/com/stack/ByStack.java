package com.stack;

import java.util.Stack;

public class ByStack {

	public static void main(String[] args) {
Stack<String>stack=new Stack<String>();
stack.push("rathan");
stack.push("anu");
stack.push("durga");
System.out.println(stack);
System.out.println(stack.search("durga"));
stack.pop();
System.out.println(stack);

System.out.println(stack);
System.out.println(stack.peek());
System.out.println(stack.empty());
stack.clear();
System.out.println(stack.empty());
  


	}

}
