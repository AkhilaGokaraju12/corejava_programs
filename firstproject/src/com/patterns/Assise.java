package com.patterns;

import java.util.Scanner;

public class Assise {
	static Scanner s=new Scanner(System.in);

	public static void main(String[] args) {
	char c[][]=new char[5][5];
String s="DHONI";
char ch='A';
	for(int i=0;i<c.length;i++) {
		for(int j=0;j<c[i].length;j++) {
if(i==j||i+j==4) {
	char c1=s.charAt(i);
	c[i][j]=c1;
}
else {
	c[i][j]=ch;
	ch++;
}
		}
	}
for(char f[]:c) {
	for(char g:f) {
		System.out.print(g);
	}
	System.out.println();
}
}
}
