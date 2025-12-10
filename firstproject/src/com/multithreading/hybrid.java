package com.multithreading;
class Test{
	void ok() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
}
public class hybrid extends Test implements Runnable {
		public static void main(String[] args) {
	hybrid h=new hybrid();
	Thread t=new Thread(h);
	t.start();
	h.ok();
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
