package com.oops;
class Address{
	String city;
	Address(String city){
		this.city=city;
	}

}
class Student implements Cloneable{
	String name;
	Address a;
Student(){
	
}
	Student(String name,Address a){
		this.name=name;
		this.a=a;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
public class ShallowCopy extends Student {

	public static void main(String[] args)throws CloneNotSupportedException {
	//Address add=new Address("city");
Address add=new Address("city");
	Student s=new Student("Akhila",add);
//before shallow copy
	System.out.println(s.name);
	System.out.println(s.a.city);
//after copy
	
	Student s1=(Student) s.clone();
System.out.println(add.city);
	System.out.println(s1.name);
	System.out.println(s1.a.city);
	s1.a.city="vizak";
	s1.name="wow";
	
	System.out.println("************");
	System.out.println(s.name);
	System.out.println(s.a.city);
	System.out.println(s1.name);
	System.out.println(s1.a.city);
	System.out.println(add.city);
	}

}
