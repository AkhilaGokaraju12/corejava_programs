package com.multithreading;

public class sleep extends Thread {

	public static void main(String[] args) throws InterruptedException {
		sleep s=new sleep();
		sleep s1=new sleep();
		s.start();
		s1.interrupt();
		for(int i=1;i<=10;i++) {
			System.out.println("k");
			Thread.sleep(1000);
			}
System.out.println(Thread.currentThread().getName());
	}
@Override
public void run() {
	for(int i=1;i<=10;i++) {
System.out.println("i");

try {
Thread.sleep(1000);
} catch (InterruptedException e) {
System.out.println(e.toString());
}
}
	System.out.println(Thread.currentThread().getName());
}
}
