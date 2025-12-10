package com.multithreading;

public class run implements Runnable {

	public static void main(String[] args) {
		run r = new run();
Thread t=new Thread(r);
t.start();

		System.out.println("main method ");
		for (int i = 1; i <= 10; i++) {
			System.out.println("g");
		}
		System.out.println(Thread.currentThread().getName());
	}

	@Override
 public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("i");
		}
		System.out.println(Thread.currentThread().getName());
	}

}
