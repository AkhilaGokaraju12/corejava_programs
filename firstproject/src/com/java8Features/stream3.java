package com.java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stream3 {

	public static void main(String[] args) {
List<String> name=Arrays.asList("srikanth","vishwa","java","simple","java");
List<String> upname=name.stream()
.filter(s->s.contains("v"))
.map(s->s.toUpperCase())
.sorted()
.distinct()
.limit(10)
.collect(Collectors.toList());

System.out.println(upname);


	}

}
