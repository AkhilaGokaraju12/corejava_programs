package com.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
class Test{
	@Override
	public String toString() {
return "test";
	}
@Override
protected void finalize() throws Throwable {
System.out.println("finalize called");
}
}
public class weakhash {

	public static void main(String[] args) throws InterruptedException {
		Map<Object,String> m=new HashMap<>(4);
	Test t=new Test();
	m.put(t,"ok");
	t=null;
	System.gc();
System.out.println(m);
Thread.sleep(1000);
Map<Object,String> m1=new WeakHashMap<>(4);
Test t1=new Test();
m1.put(t1,"ok");
t1=null;
System.gc();
System.out.println(m1);



	}

}
