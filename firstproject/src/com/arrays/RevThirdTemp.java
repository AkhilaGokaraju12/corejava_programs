package com.arrays;

public class RevThirdTemp {

	public static void main(String[] args) {
	int[] a= {1,2,3,4,5,6};
	int size=a.length;
	int temp=0;
	for(int i=0;i<size/2;i++) {
		temp=a[size-1-i];
		a[size-1-i]=a[i];
		a[i]=temp;
	}
//for(int n:a) {
//	System.out.println(n);
//}
	for(int i=0;i<size;i++) {
		System.out.println(a[i]);
	}
	}

}
