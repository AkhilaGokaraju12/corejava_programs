package com.multithreading;

public class exam extends Thread{

	public static void main(String[] args) {
		exam e=new exam();
		e.start();
for(int i=1;i<=10;i++) {
	System.out.println(i);
}

System.out.println(Thread.currentThread().getName());

	}
	public void run() {		
		for(int i=65;i<=74;i++) {
			System.out.println((char)i);
		}
		System.out.println(Thread.currentThread().getName());
	}
}
