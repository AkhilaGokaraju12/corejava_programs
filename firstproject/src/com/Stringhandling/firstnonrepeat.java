package com.Stringhandling;

import java.util.Arrays;

public class firstnonrepeat {

	public static void main(String[] args) {
	String s="swiss";
	char c[]=s.toCharArray();
	//Arrays.sort(c);
	String sr=Arrays.toString(c);
	System.out.println(sr);
	for(int i=0;i<c.length;i++) {
		int count=0;
		for(int j=0;j<c.length;j++) {
			if(c[i]==c[j]) {
				count++;
			}
		}
		if(count==1) {
       System.out.println(c[i]);
       break;
		}
	}

	}

}
