package com.Collections;

import java.util.IdentityHashMap;
import java.util.Map;

public class identyhasmap {

	public static void main(String[] args) {
//		Map<String,String> m=new HashMap<>();
//		String s="s";
//		String s1="s";
//m.put(s,"java");
//m.put(s,"sri");
//System.out.println(m);
//Map<String,String> m1=new HashMap<>();
//String i=new String("s");
//String i1=new String("s");
//m1.put(i,"sql");
//m1.put(i1,"vis");
//System.out.println(m1);
Map<String,String> m=new IdentityHashMap<>();
String s="s";
String s1="s";
m.put(s,"java");
m.put(s,"sri");
System.out.println(m);
Map<String,String> m1=new IdentityHashMap<>();
String i=new String("s");
String i1=new String("s");
m1.put(i,"sql");
m1.put(i1,"vis");
System.out.println(m1);

	}

}
