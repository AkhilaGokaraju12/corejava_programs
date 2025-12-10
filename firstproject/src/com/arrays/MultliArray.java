package com.arrays;

public class MultliArray {

	public static void main(String[] args) {
	int a[]= {12,13,25,6};
	for(int i=0;i<a.length;i++) {
		if(i%2==0) {
			System.out.println(a[i]*2);
		}
		else {
			System.out.println(a[i]*3);
		}
	}

	}

}
