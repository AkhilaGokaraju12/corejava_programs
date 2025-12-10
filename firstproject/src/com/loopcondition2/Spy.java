package com.loopcondition2;

import java.util.Scanner;

public class Spy {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		int n=s.nextInt();
		int temp=n;
		int r=0;
		int sum=0;
		int m=1;
		while(n!=0) {
			r=n%10;
			sum=sum+r;
			m=m*r;
			n=n/10;
		}
	if(sum==m) {
		System.out.println("it is spy");
	}
	else
		System.out.println("not spy");
	}

}
