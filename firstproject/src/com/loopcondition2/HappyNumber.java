package com.loopcondition2;

public class HappyNumber {

	public static void main(String[] args) {
//int n=4;
//if(n>0 && n<=9) {
//	n=n*n;
//	while(n>9) {
//		int r=0;
//		int sum=0;
//		while(n!=0) {
//			r=n%10;
//			sum=sum+(r*r);
//			n=n/10;
//		}
//		n=sum;
//	}
//}	
//else {
//while(n>9) {
//	int r=0;
//	int sum=0;
//	while(n!=0) {
//		r=n%10;
//		sum=sum+(r*r);
//		n=n/10;
//	}
//	n=sum;
//}
//}
//if(n==1) {
//	System.out.println("happy number");
//}
//else {
//	System.out.println("not happy number");
//}
		int n=19;
		if(n>0 &&n<=9) {
			n=n*n;
			while(n>9) {
				int sum=show(n);
				n=sum;
				}
		}
		else {
		while(n>9) {
		int sum=show(n);
		n=sum;
		}
		}
		System.out.println(n);
	}
static int show(int n) {
	int r=0;
	int sum=0;
	while(n!=0) {
		r=n%10;
		sum=sum+(r*r);
		n=n/10;
	}
	return sum;
	
}
}
