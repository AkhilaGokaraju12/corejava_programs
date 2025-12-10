package com.constructors;

public class Student1 {
	String name;
	int rollno;
	String course;
	Student1(String name){
		this.name=name;
	}
	Student1(String name,int rollno){
		this.name=name;
		this.rollno=rollno;
	}
	Student1(String name,int rollno,String course){
		this.name=name;
		this.rollno=rollno;
		this.course=course;
	}	
	public static void main(String[] args) {
  Student1 s1=new Student1("Akhila");
  s1.show2();
  System.out.println(s1.name);
  System.out.println(s1.rollno);
  Student1 s2=new Student1("Ramya",27);
  s2.show2();
  Student1 s3=new Student1("suresh",35,"Java Full Stack");
  s3.show2();
	}
void show2() {
	System.out.println("3nd constructor:"+name);
	System.out.println("3nd constructor:"+rollno);
	System.out.println("3nd constructor:"+course);
}
}
