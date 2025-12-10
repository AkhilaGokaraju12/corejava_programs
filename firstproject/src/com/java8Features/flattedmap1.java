package com.java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flattedmap1 {

	public static void main(String[] args) {
List<List<String>> l=Arrays.asList(Arrays.asList("java","spring"),
		Arrays.asList("python","django"));
System.out.println(l);
List<String> r=l.stream()
.flatMap(s->s.stream())
.collect(Collectors.toList());
System.out.println(r);
	}

}
