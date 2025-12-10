package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class addall {
	public static void main(String[] args) {
		List<Integer> ipl=new ArrayList<>();
		ipl.add(1);
		ipl.add(2);
		ipl.add(0);

		List<Integer> t20=new ArrayList<>();
		t20.add(4);
		t20.add(5);
		t20.add(0);
	
		List<Integer> test=new ArrayList<>();
		test.add(7);
		test.add(8);
		test.add(0);
		List<Integer> fi =new ArrayList<>();
		fi.addAll(t20);
		fi.addAll(test);
		fi.addAll(ipl);
		fi.addAll(9,test);
		System.out.println(fi);
		

	}

}
