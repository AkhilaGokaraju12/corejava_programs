package com.constructors;
public class Chain {
int a;
String name;
String branch ;
Chain(){
	this(200,"ramya");
	System.out.println("first constructor");

}
Chain(int a,String name){	
	this(2,"akhila","cse");
	this.a=a;
	this.name=name;	
	System.out.println("two argument");
}
Chain(int a,String name,String branch){	
	this.a=a;
	this.name=name;	
	this.branch=branch;
	System.out.println("three argument");
}
	public static void main(String[] args) {
		//Chain c1=new Chain();
		//c1.show();
		Chain c2=new Chain(456,"vhg");
		c2.show();
		
	}	
	void show() {
		System.out.println(a);
		System.out.println(name);
		System.out.println(branch);
	}

}
