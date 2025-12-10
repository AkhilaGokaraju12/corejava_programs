package com.Collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class sortedsetpracice {

	public static void main(String[] args) {
SortedSet<Integer> s=new TreeSet<>();
s.add(18);
s.add(42);
s.add(42);
s.add(48);
s.add(10);
System.out.println(s);
System.out.println(s.reversed());
System.out.println(s.first());
System.out.println(s.last());
System.out.println(s.tailSet(18));
System.out.println(s.headSet(18));
System.out.println(s.subSet(10,42));


	}
}
