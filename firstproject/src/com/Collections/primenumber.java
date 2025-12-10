package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class primenumber {

	public static void main(String[] args) {
List<Integer>l=new ArrayList<>();
l.add(20);
l.add(5);
l.add(21);
l.add(25);
l.add(7);
for(int i=0;i<l.size();i++) {
	if(check(l.get(i))) {
		l.set(i,0);
		System.out.println(l.get(i));
	}
	else {
		System.out.println(l.get(i));
	}
}
	}
	static boolean check(int n) {
		boolean status =true;
		if(n<=1) {
			status=false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				status=false;
			}
		}
		return status;
	}

}
