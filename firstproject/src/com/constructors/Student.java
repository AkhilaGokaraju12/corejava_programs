package com.constructors;


public class Student{
	int a;
	int b;
	public static void main(String[] args) {
	
		Student s1=new Student(100,200);
	System.out.println(s1.a);
		
		
	}
	Student(int a,int b){
	this.a=a;		
	}
}
