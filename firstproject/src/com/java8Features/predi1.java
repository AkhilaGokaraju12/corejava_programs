package com.java8Features;

import java.util.function.Predicate;

public class predi1 {

	public static void main(String[] args) {
Predicate<Integer> p=(a)->{
	System.out.println("Hi Predicate Integer");
	return a%2==0;
};
Predicate<String> p1=(a)->{
	System.out.println("Hi Predicate string");
	return a.contains("a");
};
System.out.println(p.test(10));
System.out.println(p1.test("akhila"));
	}

}
