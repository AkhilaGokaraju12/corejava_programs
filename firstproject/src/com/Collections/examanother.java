package com.Collections;

import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;

public class examanother {

	public static void main(String[] args) {
		Collection<String> b=new CopyOnWriteArrayList<>();
		b.add("akhila");
		b.add("ram");
		b.add("hello");
		b.add("ok");
		b.add("wow");
	for(String s:b) {
		if(s.equals("ram")) {
	s=s.replace(s,"i");
		}
System.out.println(s);
	}
	System.out.println(b);
	}

}
