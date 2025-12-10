package com.multithreading;

public class setgeters extends Thread{

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Thread.currentThread().setName("wow");
	System.out.println(Thread.currentThread().getName());
	Thread.currentThread().setPriority(7);
	System.out.println(Thread.currentThread().getPriority());
	System.out.println(Thread.currentThread().isDaemon());

	}

}
