package com.arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int a[]= {2,4,5,1,8};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]<a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		int c=0;
		for(int a1: a) {
			c++;
			if(c==2) {
			System.out.println(a1);
			}
		}

	}

}
