package com.constructors;
import java.math.*;
class Add1 {
	String name;
	
	Add1(String name){
		this.name=name;
	}
}
class Example5 extends Add1 {
	int r;

Example5(){
super("ramya");
r=90;
}
    public static void main(String[] args) { 
Example5 e=new Example5();
Add1 f=new Example5();
System.out.println(e.name);
System.out.println(e.r);
System.out.println(f.name);
//System.out.println(f.r);
}
}