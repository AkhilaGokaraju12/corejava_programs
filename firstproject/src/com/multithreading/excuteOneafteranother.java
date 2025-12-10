package com.multithreading;

public class excuteOneafteranother {

	public static void main(String[] args) {
		System.out.println("main method started");
	long s=System.currentTimeMillis();
		for(int i=1;i<=10;i++) {
			System.out.println("method");
		}
		System.out.println(Thread.currentThread());
hello();
long e=System.currentTimeMillis();
System.out.println(s-e);
	}
static void hello() {
	for(int i=1;i<=10;i++) {
		System.out.println("hello");
	}
	System.out.println(Thread.currentThread().getName());
}
}
