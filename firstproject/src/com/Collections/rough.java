package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class rough {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(6);
		l.add(5);
		l.add(15);
		l.add(0,50);
		l.add(2,19);
		l.set(2,null);
		System.out.println(l);
	}

}
