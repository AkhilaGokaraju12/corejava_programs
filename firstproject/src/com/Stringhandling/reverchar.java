package com.Stringhandling;

public class reverchar {

	public static void main(String[] args) {
String s="hello";
String rev="";
char[]c=s.toCharArray();
for(int i=c.length-1;i>=0;i--) {
	//System.out.print(c[i]);
	rev=rev+c[i];
}
System.out.println(rev);
	}

}
