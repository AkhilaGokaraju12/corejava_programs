package com.java8Features;

import java.util.function.Consumer;

public class consumer {

	public static void main(String[] args) {
	Consumer<Integer> c=(i)->
	System.out.println(i*2);
c.accept(10);
Consumer<String> c1=(s)->{
	System.out.println(s.toUpperCase());
	System.out.println(s.codePointAt(3));
	System.out.println(s.charAt(5));
};
c1.accept("akhila");
	}

}
