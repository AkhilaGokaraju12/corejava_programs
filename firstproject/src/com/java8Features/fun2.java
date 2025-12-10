package com.java8Features;

import java.util.function.Function;

public class fun2 {

	public static void main(String[] args) {
Function<Integer,Integer> f=(i)->4*i;
Function<Integer,Integer> f1=(k)->k*k;
Function<Integer,Integer> f2=f.andThen(f1);
Function<Integer,Integer> f3=f.compose(f1);
System.out.println(f2.apply(2));
System.out.println(f3.apply(2));
	}

}
