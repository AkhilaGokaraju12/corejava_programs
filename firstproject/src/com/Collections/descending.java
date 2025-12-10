package com.Collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class descending {

	public static void main(String[] args) {
	Map<String,Integer> m=new TreeMap<>();
	m.put("a",5);
	m.put("b",1);
	m.put("c",3);
	Map<String,Integer> m1=new LinkedHashMap<>();
	SortedSet<Integer> s=new TreeSet<>();
	Set<Map.Entry<String,Integer>> en=m.entrySet();
	for(Map.Entry<String,Integer> entry:en) {
s.add(entry.getValue());
	}
for(Integer f:s.reversed()) {
	for(Map.Entry<String,Integer> entry:en) {
if(f.equals(entry.getValue())) {
	m1.put(entry.getKey(),entry.getValue());
}
	}
}
System.out.println(m1);
	}

}
