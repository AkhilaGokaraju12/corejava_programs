package com.Stringhandling;

import java.util.Arrays;

public class DupVow {

	public static void main(String[] args) {
String s="Smart pepole plan daily work perfectly".toLowerCase();
String[] s1=s.split(" ");

for(String a:s1) {
	String du="";
	for(int i=0;i<a.length();i++) {
	boolean check=false;
		for(int j=0;j<du.length();j++) {
			if(a.charAt(i)==du.charAt(j)) {
				check=true;			
			}
		}
		if(!check) {
			du=du+a.charAt(i);
		}
	}
char c[]=du.toCharArray();
int co=0;
for(char c1:c) {

	if(c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u') {
		co++;
	}
	}
if(co>=1) {
	System.out.println(du);
	break;

}
}
	}

}
