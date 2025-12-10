package com.Stringhandling;

public class max {

	public static void main(String[] args) {
String s1="find the longest string";
String s[]=s1.split(" ");
String temp="";
for(int i=0;i<s.length;i++) {
	int max=i;
	for(int j=i+1;j<s.length;j++) {
		if(s[j].length()>s[max].length()) {
			max=j;
		}		
	}
	temp=s[i];
	s[i]=s[max];
	s[max]=temp;
}
int c=0;
for(String a:s) {
	c++;
if(c<=2) {
	System.out.println(a);
}
}

	}

}
