package com.arrays;

import java.util.Scanner;

public class Read2D {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
	int a=s.nextInt();
	int b=s.nextInt();
	int arr[][]=new int[a][b];
//	for(int i=0;i<a;i++) {
//		for(int j=0;j<arr[i].length;j++) {
//			 arr[i][j]=s.nextInt();
//		}
//	}
	int k=0;
	int l=0;
	for(int arr1[]:arr) {
int temp=s.nextInt();
arr[k][l]=temp;
k++;
l++;
	}
	for(int i=0;i<a;i++) {
		for(int j=0;j<b;j++) {
		System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	}
}
