package com.arrays;

public class ConsecutiveNumber {

	public static void main(String[] args) {
	int a[]= {1,2,3,4,6,2,7,8};
	int n=12;

	for(int i=0;i<a.length-1;i++) {
		if((a[i]*a[i+1])==n) {
			System.out.println(a[i]+" "+a[i+1]);

		}
	}
	}

}
