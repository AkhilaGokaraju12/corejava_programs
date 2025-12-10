package com.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class First {

	public static void main(String[] args) {
Collection<Integer> c=new ArrayList<>();
c.add(1);
c.add(200);
c.add(100);
c.add(200);
c.add(null);
c.add(null);
//System.out.println(c.add(19.2));
//System.out.println(c);
////for each
for(Object s:c) {
	System.out.println(s);
}
/// for loop
//for(int i=0;i<c.size();i++) {
//	System.out.println(c);
//}
////iterator

//System.out.println(c);
//Object s[]=c.toArray();
//for(int i=0;i<s.length;i++) {
//
//}
//boolean i=c.remove(1);
//
System.out.println(c);
System.out.println(c.remove(89));

	}
	
}
