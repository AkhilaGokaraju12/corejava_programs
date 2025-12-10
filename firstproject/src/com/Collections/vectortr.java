package com.Collections;

import java.util.Enumeration;
import java.util.Vector;

public class vectortr {

	public static void main(String[] args) {
Vector<Integer> v=new Vector<>(4);
v.addElement(10);
v.addElement(20);
v.addElement(30);
v.add(40);
v.add(2,78);
v.addElement(10);
v.addElement(20);
v.addElement(30);
v.add(40);
v.add(2,78);
v.addElement(10);
v.addElement(20);
v.addElement(30);
v.add(40);
v.add(2,78);
System.out.println(v);
Enumeration <Integer> e=v.elements();
while(e.hasMoreElements()) {
	System.out.println(e.nextElement());
}
	}

}
