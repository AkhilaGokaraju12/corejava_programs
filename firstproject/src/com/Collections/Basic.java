package com.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Basic {

	public static void main(String[] args) {
	Collection<Integer> l=new ArrayList<>();
l.add(1);
l.add(2);
l.add(7);
l.add(3);
l.add(9);
Iterator<Integer> itr=l.iterator();

while(itr.hasNext()) {
	System.out.println(itr.next());
}
	}

}
