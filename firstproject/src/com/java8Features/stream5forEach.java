package com.java8Features;

import java.util.Arrays;
import java.util.List;

public class stream5forEach {

	public static void main(String[] args) {
List<Double> sal=Arrays.asList(80000.00,40000.00,90000.00,75000.00,
		56000.00,78000.00,39000.00);
sal.stream()
.filter(d->d>50000.00)
.map(i->i+50000.00)
.sorted()
.forEach(c->System.out.print(c+","));

	}

}
