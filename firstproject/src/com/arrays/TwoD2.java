package com.arrays;

public class TwoD2 {

	public static void main(String[] args) {
int a[][]= {{1,2,3},{4,5,6},{7,8}};
int a1[]= {10,20};
//System.out.println(a[1][1]);
System.out.println(a.length);
System.out.println(a[2].length);
//for loop
for(int i=0;i<a.length;i++) {
	for(int j=0;j<a[i].length;j++) {
		System.out.print(a[i][j]+" ");
	}
	System.out.println();
}
System.out.println(a);
	
//	//for each
//	for(int arr[]:a) {
//		for(int arr1:arr) {
//			System.out.print(arr1+" ");
//		}
//		System.out.println();
//	}
	}
}
