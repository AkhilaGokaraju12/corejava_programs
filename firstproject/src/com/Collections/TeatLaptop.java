package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TeatLaptop {



	public static void main(String[] args) {
	Laptop l=new Laptop("dell","intel",89000);
	Laptop l1=new Laptop("mac","intel",29000);
	Laptop l2=new Laptop("apple","intel",909000);
	Laptop l3=new Laptop("red","intel",8000);
	List<Laptop> co=new ArrayList<>();
	co.add(l);
	co.add(l1);
	co.add(l2);
	co.add(l3);
//	
//	Comparator<Laptop> c=new Comparator<Laptop>(){
//
//		@Override
//		public int compare(Laptop o1, Laptop o2) {
//			if(o1.price <o2.price) {
//				return -1;
//			}
//			else if(o1.price >o2.price) {
//				return 1;
//			}
//			else {
//				return 0;
//			}	}
//	};
	////lambda expression
	Comparator<Laptop> c=(o1,o2)->(o1.price <o2.price)?-1:(o1.price >o2.price)?1:0;
Collections.sort(co,c);
	for(Laptop s:co) {
		System.out.println(s);
	}
	
	}

}
