package com.java8Features;

import java.util.Arrays;
import java.util.List;

public class stream4reduce {

	public static void main(String[] args) {
List<Integer> num=Arrays.asList(2,3,5,6,7,8,9,10);
int sum1=num.stream()
.filter(n->n%2==0)
.map(n->n*n)
.reduce(0,Integer::sum);
System.out.println(sum1);
	}

}
