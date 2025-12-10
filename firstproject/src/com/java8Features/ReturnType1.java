package com.java8Features;
interface Test5{
	int addition(int a,int b);
}
public class ReturnType1 {
	public static void main(String[] args) {
		Test5 t=(a,b)->{
			System.out.println(a+b);
			return 7;
		};
		int a=t.addition(1,4);
		System.out.println(a);
	
	}
}
