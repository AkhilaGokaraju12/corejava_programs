package com.multithreading;

public class Demon extends Thread {

	public static void main(String[] args) { 
		Demon d=new Demon();
		d.setDaemon(true);
	d.start();
		//System.out.println(Thread.currentThread().isDaemon());
	for(int i=1;i<=5;i++) {
		System.out.println("main");
	}
	}
	public void run() {
		System.out.println(Thread.currentThread().isDaemon());
for(int i=1;i<=5;i++) {
	System.out.println("run");
}
	}

}
