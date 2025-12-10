package com.java8Features;
interface Test2{
	void method(int a,int b);

 default void ok() {
	System.out.println("default");
	ok3();
}
static void ok1() {
	System.out.println("static");
	
}
 private static void ok3() {
	System.out.println("private");
}
}
public class MultipleArug {

	public static void main(String[] args) {
Test2 t=(int a,int b)->{
	System.out.println(a+b);
};
Test2 t1=(a,b)->{
	System.out.println(a+b);
};
t.method(2,3);
t1.method(6,8);
t.ok();
Test2.ok1();

	}
	void ok() {
		
	}

}
