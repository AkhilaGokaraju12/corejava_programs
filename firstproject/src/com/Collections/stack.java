package com.Collections;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
Stack <String> s=new Stack<>();
s.add("10");
s.add("20");
s.add("30");
s.add("40");
s.add("50");
s.add("60");
System.out.println(s);
System.out.println(s.pop());
System.out.println(s);
System.out.println(s.peek());
System.out.println(s.search("10"));
	}

}
