package com.arrays;

public class TwoDString {

	public static void main(String[] args) {
	String s[][]=new String[2][2];
	s[0][0]="Akhila";
	s[0][1]="naidu";
	s[1][0]="ram";
    s[1][1]="okkk";
	
for(int i=0;i<s.length;i++) {
	for(int j=0;j<s[i].length;j++) {
		System.out.print(s[i][j]+" ");
	}
	System.out.println();
}
}
}