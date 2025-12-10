package com.arrays;

public class Transpose {

	public static void main(String[] args) {
	int a[][]=new int[2][2];
	a[0][0]=1;
	a[0][1]=2;
	a[1][0]=3;
	a[1][1]=4;
	for(int a1[]:a) {
		for(int a2:a1) {
			System.out.print(a2+" ");
		}
		System.out.println();
	}
	System.out.println("Transpose matrix");
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			System.out.print(a[j][i]+ " ");
		}
		System.out.println();
	}

	}

}
