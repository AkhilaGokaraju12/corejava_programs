package com.Stringhandling;

public class Basic {
static String s2="akhila";
String name=new String("akhila");
	public static void main(String[] args) {
//		Basic b=new Basic();
//String s="akhila";
//String s1="akhila";
//System.out.println(System.identityHashCode(s));
//System.out.println(System.identityHashCode(s1));
//System.out.println(System.identityHashCode(s2));
//System.out.println(System.identityHashCode(b.name));
//String o=new String();
//System.out.println("add"+o);
//String i="akhila";
//String j="ahoiu";
//System.out.println(j.compareTo(i));
//String n="srikanthakhila";
//String n1="srikanthjava";
//System.out.println(n.compareTo(n1));
//char c[]= {'A','b','c','f','h'};
//String c1=String.copyValueOf(c);
//String c2=String.copyValueOf(c, 1, 3);
//System.out.println(c1);
//System.out.println(c2);
//String sub="akhila";
//System.out.println(sub.substring(2));
////charAt and index
//String se="akhila";
//System.out.println(se.charAt(1));
//System.out.println(se.indexOf('i'));

/////index of three
//String t="Srikanth java";
//System.out.println(t.indexOf('a'));
//System.out.println(t.indexOf('a',t.indexOf('a')+1));
//System.out.println(t.indexOf('a',t.indexOf('a',t.indexOf('a')+1)+1));
//System.out.println(t.indexOf("kant"));

////intern
//String s="akhila";
//String s1="akhila";
//String s2=new String("java");
//String s3="java";
//System.out.println(System.identityHashCode(s));
//System.out.println(System.identityHashCode(s1));
//System.out.println(System.identityHashCode(s2));
//System.out.println(System.identityHashCode(s3));
////before intern
//System.out.println(s1==s);
//System.out.println(s2==s3);
//System.out.println("****");
//s2=s2.intern();
//System.out.println(System.identityHashCode(s));
//System.out.println(System.identityHashCode(s1));
//System.out.println(System.identityHashCode(s2));
//System.out.println(System.identityHashCode(s3));
//System.out.println(s1==s);
//System.out.println(s2==s3);
		///trim and replace
		String s2="     a  khila       ";
		//System.out.println(s2.trim());
		System.out.println(s2.replaceAll("\\s",""));
	}
}
