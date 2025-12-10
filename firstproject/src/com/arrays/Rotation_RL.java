package com.arrays;

import java.util.Scanner;

public class Rotation_RL {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int r=s.nextInt();
int a[]= {1,2,3,4,5,6,7,8};
rotation(a,r);
for(int a1:a) {
	System.out.println(a1);
}
	}
static void rotation(int a[],int r) {
	int e=a.length-1;
	int s=0;
	reverse(a,s,e);
	reverse(a,s,r-1);
	reverse(a,r,e);
}

static void reverse(int a[],int start,int end) {
	int temp=0;
	while(start<=end) {
	temp=a[end];
	a[end]=a[start];
	a[start]=temp;
	start++;
	end--;
	}
	
}
}
