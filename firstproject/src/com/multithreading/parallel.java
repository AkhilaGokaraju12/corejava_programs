package com.multithreading;

public class parallel extends Thread {

	public static void main(String[] args) {
parallel p1=new parallel();	
p1.start();
System.out.println(Thread.currentThread().getName());

for(int i=1;i<=20;i++) {
	System.out.println("main"+i);
}
	}
	
 public void run() {
	for(int i=1;i<=10;i++) {
		System.out.println("run"+i);
	}
	System.out.println(Thread.currentThread().getName());
}

}
