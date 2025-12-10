package com.multithreading;

public class prority extends Thread{

	public static void main(String[] args) {
		prority p=new prority();
		p.start();
	
		System.out.println("main"+ "="+Thread.currentThread().getPriority());
		System.out.println("main"+" : "+Thread.currentThread());
	for(int i=1;i<=10;i++) {
		System.out.println("m");
	}
		
	}

	public void run() {
		Thread.currentThread().setPriority(9);
		System.out.println("run"+ "="+Thread.currentThread().getPriority());
		for(int i=1;i<=10;i++) {
			System.out.println("r");
		}
		System.out.println("run"+" : "+Thread.currentThread());
	}

}

