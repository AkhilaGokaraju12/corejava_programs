package com.java8Features;

import java.util.function.Function;

public class fun {

	public static void main(String[] args) {
Function<Integer,Integer> f=(i)->i*i;
System.out.println(f.apply(10));
Function<String,Integer> f1=(s)->s.codePointAt(1);
System.out.println(f1.apply("akhila"));
Function<String,String> f2=(s)->s.substring(3);
System.out.println(f2.apply("srikanth"));
Function<String,Boolean> f3=(s)->s.isEmpty();
System.out.println(f3.apply(" "));
Function<Integer,Boolean> f4=(s)->s>10;
System.out.println(f4.apply(5));


	}

}
