package com.arrays;

public class TwoD {

	public static void main(String[] args) {
	int[] []a=new int[2][3];

//	System.out.println(a.length);
//	System.out.println(a[0].length);

	a[0][0]=1;
	a[0][1]=2;
	a[0][2]=3;
	a[1][0]=5;
	a[1][1]=6;

//	System.out.println(a[0][0]);
//for(int i=0;i<a.length;i++) {
//	for(int j=0;j<a[i].length;j++) {
//		System.out.print(a[i][j]+" ");
//
//	}
//	System.out.println();
//}

	//for each
	for(int arr[]:a) {
		for(int arr1:arr) {
			System.out.print(arr1+" ");
		}
		System.out.println();
	}
	}

}
