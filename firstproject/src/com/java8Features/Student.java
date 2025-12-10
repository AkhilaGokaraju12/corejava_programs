package com.java8Features;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Student {
String name;
int marks;
	public Student(String name, int marks) {

	this.name = name;
	this.marks = marks;
}
}
class TestDemo{
	public static void main(String[] args) {
		Function<Student,String> f=(stu)->{
		 String grade="";
		 int marks=stu.marks;
		 if(marks>=80) 
			 grade="A";
		 else if(marks>=60) 
			 grade="B";
		 else if(marks>=50) 
			 grade="C";
		 else if(marks>=35) 
			 grade="D";
		 else
			 grade="fail";
		 
		 return grade;
		};
		Student s[]= {new Student("akhila",78),new Student("ram",65),new Student("mani",97),
				new Student("hari",48),new Student("many",86)};
		Predicate<Integer> p=(i)->(i>80);
		Consumer<Student> c=(st)->{
			System.out.println("name : "+st.name);
			System.out.println("marks : "+st.marks);
			System.out.println("grade : "+f.apply(st));
			System.out.println("**************");
		};
		for(Student s1:s) {
			if(p.test(s1.marks)) {
                 c.accept(s1);
			}
		}
	}
}