package com.multithreading;

public class yieldcl extends Thread {

	public static void main(String[] args) {
		yieldcl y=new yieldcl();
		y.start();
		for(int i=1;i<=20;i++) {
			System.out.println("main");
		}
	System.out.println(Thread.currentThread().getName());
	}

public void run() {
	Thread.yield();
for(int i=1;i<=20;i++) {
	System.out.println("run");
}
System.out.println(Thread.currentThread().getName());
}
}
