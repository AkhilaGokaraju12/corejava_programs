package com.java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stream2 {

	public static void main(String[] args) {
List<Integer> l=Arrays.asList(1,2,9,0,5,11);
List<Integer> l1=l.stream().filter((i)->i%2==0)
.sorted()
.collect(Collectors.toList());
System.out.println(l1);

	}

}
