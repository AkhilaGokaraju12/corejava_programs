package com.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeDuplicate {

	public static void main(String[] args) {
List <Integer> l=new ArrayList<>();
l.add(2);
l.add(3);
l.add(4);
l.add(3);
l.add(3);
l.add(1);
//Object s[]=l.toArray();
//Arrays.sort(s);
//String s1=Arrays.toString(s);
//System.out.println(s1);
//for(int i=0;i<s.length;i++) {
//	int c=0;
//	for(int j=0;j<s.length;j++) {
//		if(s[i]==s[j]) {
//			c++;
//		}
//	}
//	if(c==1) {
//	System.out.println(s[i]);
//}
//}
for(int i=0;i<l.size();i++) {
	int c=0;
	for(int j=0;j<l.size();j++) {
		if(l.get(i)==l.get(j)) {
		c++;	
		}
	}
	if(c==1) {
		System.out.println(l.get(i));
	}
}
	}

}
