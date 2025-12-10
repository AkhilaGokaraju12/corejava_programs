package com.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class list01 {

	public static void main(String[] args) {
List<Integer> l=new CopyOnWriteArrayList<>();


l.add(1);
l.add(2);
List<Integer> l1=new ArrayList<>(4);
l1.add(2);
l1.add(3);
l1.add(4);
l.retainAll(l1);
System.out.println(l);

	}

}
