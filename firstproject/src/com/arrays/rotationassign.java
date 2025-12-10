package com.arrays;

public class rotationassign { 

	public static void main(String[] args) {
		int k=2;
String s[]= {"Alice","Bob","charlie","david","Eva"};
String arr[]=s.clone();
String arr1[]=s.clone();
right(arr,k);
for(String s1:arr) {
	System.out.print(s1+",");
}
System.out.println();
left(arr1,k);
for(String s1:s) {
	System.out.print(s1+",");
}

	}
static void right(String s[],int k) {
	int e=s.length-1;
	result(s,0,e);
	result(s,0,k-1);
	result(s,k,e);
}
static void left(String s[],int k) {
	int e=s.length-1;
	result(s,0,k-1);
	result(s,k,e);
    result(s,0,e);
}
static void result(String s[],int st,int e ) {
	while(st<=e) {
		String temp=s[e];
		s[e]=s[st];
		s[st]=temp;
		st++;
		e--;		
	}
}
}
