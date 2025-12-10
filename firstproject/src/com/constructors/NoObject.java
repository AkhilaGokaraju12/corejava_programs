package com.constructors;

public class NoObject {
	int a;
	int b;
	int c;
	
NoObject(){
	this(10);
}
NoObject(int a){
	this(10,20);
}
NoObject(int a,int b){
	this(10,20,30);
}
NoObject(int a,int b,int c){
	//System.out.println(a);
	//System.out.println(b);
	//System.out.println(c);
	
}
	public static void main(String[] args) {
	new NoObject();

	}
	

}
