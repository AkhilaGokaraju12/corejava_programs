package com.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class copyarray {

	public static void main(String[] args) {
List<String>l=new CopyOnWriteArrayList<>();
//List<String>l=new ArrayList<>();
l.add("10");
l.add("20");
l.add("30");
l.add("30");
System.out.println(l);

//while(li.hasNext()) {
//
//if(li.next().equals("20")) {
//	l.remove("20");
//}
//}

	l.add("89");
	Iterator<String> li=l.iterator();
while(li.hasNext()) {
	System.out.println(li.next());
}
System.out.println(l);
	}

}
