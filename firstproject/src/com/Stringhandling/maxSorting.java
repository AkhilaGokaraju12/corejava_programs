package com.Stringhandling;

import java.util.Arrays;

public class maxSorting {

	public static void main(String[] args) {
		String s="I love programming";
		String s1[]=s.split(" ");
		int max=0;
		String m="";

		for(int i=0;i<s1.length;i++) {
			if(s1[i].length()>max) {
			max=s1[i].length();
			m=s1[i];
			}
		}
System.out.println(m);
char c[]=m.toCharArray();
Arrays.sort(c);
System.out.println(Arrays.toString(c));
for(int i=0;i<c.length;i++) {
	int co=0;
	for(int j=0;j<c.length;j++) {
		if(c[i]==c[j]) {
			co++;
		}
	}
	if(co==1) {
		System.out.print(c[i]);
	}
	if(co>1) {
		System.out.print(c[i]);
		i++;
	}
}
//String s="programming";
//String s1="agimnopr";
//String k="";
//	for(int i=0;i<s.length();i++) {
//		if(s1.contains(""+s.charAt(i))) {
//			k=k+s.charAt(i);
//			s1=s1.replace(""+s.charAt(i),"");
//		}
//	}
//System.out.println(k);
///array
//int a[]= {4,2,7,2,9,4,7,3,3,3};
//String s1="23479";
//String s2="";
//for(int i=0;i<a.length;i++) {
//for(int j=0;j<s1.length();j++) {
//if(s1.contains(a[i]+"")) {
//	s2=s2+a[i];
//	s1=s1.replace(""+a[i],"");
//}
//}
//}
//System.out.println(s2);
	}

}
