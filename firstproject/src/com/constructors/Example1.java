package com.constructors;

class Example1 {

	public static void main(String[] args) {
	byte a=10;
	byte b=20;	
	System.out.println(show(a,b));
	
	}	
	static byte show(byte a,byte b) {
		byte c=(byte)(a+b);
		return c;
	}
}

