package com.java8Features;
@FunctionalInterface
interface Test{
	void method();
}
//class Test1 implements Test{
//
//	@Override
//	public void method() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}
public class NoArug {

	public static void main(String[] args) {
	Test t=()->{System.out.println("t");
	
	};
	Test t1=()->System.out.println("t1");
t1.method();	
t.method();

	}

}
