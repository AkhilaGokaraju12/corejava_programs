package com.Stringhandling;

public class Startwith {

	public static void main(String[] args) {
	String s[]={"akhila","ram","chai","ak","vi","Agt"};
String s1="akhila";
////startwith
System.out.println(s1.startsWith("a"));
System.out.println(s1.startsWith("A"));
System.out.println(s1.toUpperCase().startsWith("A"));
System.out.println(s1.startsWith("ak"));
System.out.println(s1.startsWith("hi",2));
System.out.println("***********");
////end with
System.out.println(s1.endsWith("a"));
System.out.println(s1.endsWith("A"));
System.out.println(s1.endsWith("la"));
//// sub sequences
System.out.println(s1.subSequence(2,5));
///sub String
System.out.println("************");
System.out.println(s1.substring(3));
System.out.println(s1.substring(2,5));
System.out.println("************");
char c[]= {'a','b'};
int c1[]= {1,2,3};
String s3=String.copyValueOf(c);
String s4=String.valueOf(c1);
String s5=String.valueOf(true);//anyting
System.out.println(s3);
System.out.println(s4);



	}

}
