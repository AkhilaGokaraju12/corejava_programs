package com.loopcondition;

import java.util.Scanner;

public class Perfect {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
show();

	}
static void show() {
	System.out.println("enter a number");
	int n=s.nextInt();
	int sum=0;
	for(int i=1;i<n;i++) {
		if(n%i==0) {
			sum=sum+i;
		}
	}
if(n==sum) 
	System.out.println("given number is perfect");
else
	System.out.println("given number is not perfect");
}
}
//boolean b=show();
//if(b)
//	System.out.println("given number is perfect");
//else
//	System.out.println("given number is not  perfect");
//}
//static boolean show() {
//	boolean status;
//System.out.println("enter a number");
//int n=s.nextInt();
//int sum=0;
//for(int i=1;i<n;i++) {
//	if(n%i==0) {
//		sum=sum+i;
//	}
//}
//if(sum==n) {
//	status=true;
//}
//else
//	status=false;
//
//return status;
//}
//}
//
