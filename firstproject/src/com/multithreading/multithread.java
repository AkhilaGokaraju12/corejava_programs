package com.multithreading;
class Audio extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Audio");
		}
		System.out.println(Thread.currentThread().getName());
	}
}
class Video extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Video");
		}
		System.out.println(Thread.currentThread().getName());
	}
}
class Timer extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Timer");
		}
		System.out.println(Thread.currentThread().getName());
	}
}
public class multithread {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());	
	Timer t=new Timer();
	Audio a=new Audio();
	Video v=new Video();
	t.start();
	a.start();
	v.start();

	}

}
