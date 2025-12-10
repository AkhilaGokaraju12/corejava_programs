package com.java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class optional {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(4,2,7,9,6,8);
Optional<Integer> o=l.stream().max((i1,i2)->i1.compareTo(i2));
System.out.println("max"+o);
Optional<Integer> o1=l.stream().min((i1,i2)->i1.compareTo(i2));
System.out.println("min"+o1);

	}

}
