package com.loopcondition2;

import java.util.Scanner;

public class StrongNumber {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		for(int i=1;i<=50000;i++) {
	strong(i);
	}
	}
static void strong(int n) {
	int temp=n;
	int r=0;
	int sum=0;
	while(n!=0) {
		r=n%10;
		int f=1;
		for(int i=1;i<=r;i++) {
			f=f*i;
		}
		sum=sum+f;
		n=n/10;
	}
	if(sum==temp)
System.out.println(sum);	
}
}
