package com.constructors;

public class Arg  {
	int rollno;
	String name;
	String course;
	int marks;
	double price;
	
	Arg(){
		this(21);
	}
	Arg(int rollno){
		this(21,"Akhila");
		this.rollno=rollno;
		
	}
Arg(int rollno,String name){
	this(21,"Akhila","CSE");
		this.rollno=rollno;
		this.name=name;
	}
Arg(int rollno,String name,String course){
	this(21,"Akhila","CSE",100);
	this.rollno=rollno;
	this.name=name;
	this.course=course;
	
}
Arg(int rollno,String name,String course,int marks){
	this(21,"Akhila","CSE",100,30000.00);
	this.rollno=rollno;
	this.name=name;
	this.course=course;
	this.marks=marks;
}
Arg(int rollno,String name,String course,int marks,double price){
	this.price=price;
	
}
	public static void main(String[] args) {


	}
}
