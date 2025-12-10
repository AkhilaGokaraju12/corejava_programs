package com.Collections;

import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class mirror {

	public static void main(String[] args) {
Vector<Integer> l=new Stack<>();
l.add(1);
l.add(2);
l.add(3);
l.add(4);
l.add(5);
ListIterator<Integer> litr=l.listIterator();
while(litr.hasNext()) {
	System.out.println(litr.next());
}
System.out.println("*****************");
while(litr.hasPrevious()) {
	System.out.println(litr.previous());
}

	}

}
