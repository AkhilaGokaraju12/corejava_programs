package com.constructors;

public class Example3 extends Thread {

	public static void main(String[] args) {
		Example3 e = new Example3();
		e.start();
		for (int i = 1; i <= 5; i++) {
			System.out.println("i");
		}

	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(9);
		}
	}
}
