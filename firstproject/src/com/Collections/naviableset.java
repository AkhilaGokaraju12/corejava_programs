package com.Collections;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class naviableset {

	public static void main(String[] args) {
		NavigableSet<Integer> s=new TreeSet<>();
		s.add(18);
		s.add(42);
		s.add(42);
		s.add(48);
		s.add(10);
		System.out.println(s);
		System.out.println(s.floor(41));
		System.out.println(s.ceiling(41));
		System.out.println(s.higher(42));
		System.out.println(s.lower(42));
	}

}
