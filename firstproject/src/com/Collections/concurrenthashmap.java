package com.Collections;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class concurrenthashmap {

	public static void main(String[] args) {
Map<Integer,String> m=new ConcurrentHashMap<>();
m.put(1,"rahul");
m.put(77,"gill");
m.put(63,"sky");
m.put(4,"abshiek");
System.out.println(m);
Set<Map.Entry<Integer,String>> en1=m.entrySet();
Set<Map.Entry<Integer,String>> en=m.entrySet();
for(Map.Entry<Integer,String> e:en) {

	m.put(99,"tilak"); 

	
}
System.out.println(m);
System.out.println(en);
System.out.println(en1);
	}

}
