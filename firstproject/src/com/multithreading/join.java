package com.multithreading;
class Thread1 extends Thread{
	public void run() {
	for(int i=1;i<=20;i++) {
		System.out.println("t1"+":"+i);
	}
	}
}
class Thread2 extends Thread{
	Thread3 j3;
	Thread2(Thread3 j3){
		this.j3=j3;
	}
	public void run() {
		for(int i=21;i<=40;i++) {
			
			if(i==30) {
				try {
					j3.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("t2"+":"+i);
		}
		
	}
}
class Thread3 extends Thread{
	public void run() {
		for(int i=41;i<=60;i++) {
			System.out.println("t3"+":"+i);
		}
	}
}
public class join {
	public static void main(String[] args) {
		Thread1 j1=new Thread1();
		Thread3 j3=new Thread3();
		Thread2 j2=new Thread2(j3);
		j1.start();
		j2.start();
		j3.start();
	}

}
