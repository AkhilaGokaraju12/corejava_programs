package com.loopcondition2;

import java.util.Scanner;

public class LastDigit {
static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		int n=8658623;
		int a=n;
		int digit=0;
		int r1=0;
		int m=0;
		int h=0;
		int i=0;
	while(n!=0) {
		digit=n%10;
	   int c=0;
	   int temp=a;
		while(temp!=0) {
			r1=temp%10;
			if(digit==r1) {
				c++;
			}
			temp=temp/10;
		}
		
		if(c==2) {	
			System.out.println(digit);
		
		}
		n=n/10;

}
	}
	}




//int n=2;
//int n1=456226;
//int c=0;
//while(n1!=0) {
//int r=n1%10;
//if(n==r) {
//	c++;
//}
//n1=n1/10;
//}
//System.out.println(c);
//}
//}