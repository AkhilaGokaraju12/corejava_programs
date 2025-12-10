package com.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class asscending_maArray {

	public static void main(String[] args) {
		Collection<Integer> l=new ArrayList<>();
		l.add(30);
		l.add(20);
		l.add(50);
		l.add(45);
		l.add(10);
		System.out.println(l);
	Map<Integer,Integer> m=new TreeMap<>();
	for(Integer i:l) {
		m.put(i,i);
	}
	System.out.println(m.keySet());

	}

}
