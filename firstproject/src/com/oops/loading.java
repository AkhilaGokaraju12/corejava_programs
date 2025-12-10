package com.oops;

public class loading {
public static void main(String[] args) {
	add(1,2);
	add(3.4,6.7);
	add("akhila","naidu");
}
static void add(int a,int b) {
	System.out.println(a+b);
}
static void add(double a,double b) {
	System.out.println(a+b);
}
static void add(String a,String b) {
	System.out.println(a+b);
}
}
