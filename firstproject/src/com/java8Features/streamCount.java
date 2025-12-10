package com.java8Features;

import java.util.stream.Stream;

public class streamCount {

	public static void main(String[] args) {
long a=Stream.of("apple","banana","cherry")
.filter(s->s.contains("a"))
.count();
System.out.println(a); 
	}

}
