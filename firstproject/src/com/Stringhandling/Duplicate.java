package com.Stringhandling;

import java.util.Arrays;

public class Duplicate {

	public static void main(String[] args) {
	String s="java";
	char c[]=s.toCharArray();
	Arrays.sort(c);
String s1=Arrays.toString(c);
System.out.println(s1);
	for(int i=0;i<c.length;i++) {
		int count=0;
		for(int j=0;j<c.length;j++) {
			if(c[i]==c[j]) {
					count++;	
			}
		}

		if(count>1) {
			System.out.println(c[i]+"-"+count);
			i++;
		}
		else {
			System.out.println(c[i]+"-"+count);
		}
	}

	}

}
