package com.constructors;
import java.util.*;
public class Example {
 int a1;
int b1;
int c1;
int d1;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	Example e1=new Example(100,200);
	e1.add();
	e1.show(30,40);
	System.out.println(e1.a1+e1.b1);
	

	}
	void show(int a1,int b1) {
	  this.a1=a1;
	   this.b1=b1;
			
	}
	Example(int c1,int d1){
		this.c1=c1;
		this.d1=d1;
		
	}
	void add() {
		System.out.println(c1+d1);
	
	}
}


