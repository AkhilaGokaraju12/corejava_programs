package com.java8Features;
interface Test1{
	void method(int a);
}
public class singleAru {

	public static void main(String[] args) {
Test1 t=(int a)->{
	System.out.println(a*a*a);
};
Test1 t1=(a)->{
	System.out.println(a*a*a);
};
Test1 t2=a->{
	System.out.println(a*a*a);
};
t.method(10);
t1.method(9);
t2.method(8);
	}

}
