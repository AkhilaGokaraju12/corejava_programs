package com.java8Features;

import java.util.function.Predicate;

public class pred2 {

	public static void main(String[] args) {
Predicate<Integer> even=(a)->a%2==0;
Predicate<Integer> greater=(a)->a>10;
Predicate<Integer> and=even.and(greater);
Predicate<Integer> or=even.or(greater);
Predicate<Integer> neg=even.negate();
System.out.println(even.test(10));
System.out.println(greater.test(20));
System.out.println(and.test(5));
System.out.println(or.test(11));
System.out.println(neg.test(10));



	}

}
