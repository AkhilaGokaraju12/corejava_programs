package com.Stringhandling;

public class revereseArray {

	public static void main(String[] args) {
String s="Java is Fun";
String []s1=s.split(" ");
String r="";
String f="";
for(int i=0;i<s1.length;i++) {
char c[]=s1[i].toCharArray();
for(int k=c.length-1;k>=0;k--) {
	r=r+c[k];
}
}
System.out.println(r);
	}

}
