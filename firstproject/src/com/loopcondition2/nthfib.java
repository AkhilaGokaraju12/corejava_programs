package com.loopcondition2;

import java.util.Scanner;

public class nthfib {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=10;
		int a=0;
		int b=1;
		int c=a+b;
		int count=2;
		int nth=s.nextInt();
		for(int i=3;i<=10;i++) {
			c=a+b;
			count++;
			if(nth==1) {
				System.out.println(0);
				break;
				
			}
			else if(nth==2) {
				System.out.println(1);
				break;
			}
			else if(nth==count) {
				System.out.println(c);
				break;
			}

			a=b;
			b=c;
		}

	}

}
/// another way
//int n=10;
//int a=0;
//int b=1;
//int c=a+b;
//int count=2;
//int nth=s.nextInt();
//while(c<=10) {
//	c=a+b;
//	count++;
//	if(nth==1) {
//		System.out.println(0);
//		break;
//		
//	}
//	else if(nth==2) {
//		System.out.println(1);
//		break;
//	}
//	else if(nth==count) {
//		System.out.println(c);
//		break;
//	}
//
//	a=b;
//	b=c;
//}
