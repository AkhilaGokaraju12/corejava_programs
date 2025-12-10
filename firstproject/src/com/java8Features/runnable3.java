package com.java8Features;

//public class runnable3 implements Runnable{
//	public static void main(String[] args) {
//		runnable3 r=new runnable3();
//		Thread t=new Thread(r);
//		t.start();
//		for(int i=0;i<=10;i++) {
//			System.out.println("main"+i);
//		}
//	}
//	@Override
//	public void run() {
//	for(int i=0;i<=10;i++) {
//		System.out.println("run"+i);
//	}
//	}
//}
/////2
//public class runnable3{
//	public static void main(String[] args) {
//		Runnable r=()->{
//			for(int i=0;i<=10;i++) {
//				System.out.println("run"+i);
//			}	
//		};
//		Thread t=new Thread(r);
//		t.start();	
//		for(int i=0;i<=10;i++) {
//			System.out.println("main"+i);
//		}		
//	}
//}
/////3
public class runnable3{
public static void main(String[] args) {
	Runnable r=new Runnable(){

		@Override
		public void run() {
			for(int i=0;i<=10;i++) {
				System.out.println("run"+i);
			}		
		}
	
	};
	Thread t=new Thread(r);
	t.start();	
	for(int i=0;i<=10;i++) {
		System.out.println("main"+i);
	}		
}
}
//}