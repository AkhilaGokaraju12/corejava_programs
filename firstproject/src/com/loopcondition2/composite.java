package com.loopcondition2;

import java.util.Scanner;

public class composite {
static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
	//int n=s.nextInt();
// int c=0;
//
//  for(int i=1;i<=n;i++) {
//	if(n%i==0) {
//		c++;		
//	}
//  }
//	if(c>2) {
//		if(pfsum(n)==csum(n)) {
//			System.out.println("smith number");
//		}
//		else {
//			System.out.println("not smith number");
//		}
//	}
//	else {
//		System.out.println("n is not composite");
//	}
//}
//	static int csum(int n) {
//		int sum=0;
//		while(n!=0) {
//			int r=n%10;
//			sum=sum+r;
//			n=n/10;
//		}
//		return sum;
//	}
	pfsum(666);
	}
	static void pfsum(int n) {
		int sum=0;
		while(n>1) {
			for(int i=2;i<=n;i++) {
				if(n%i==0) {
					System.out.println(i);
					n=n/i;
					break;
				}
			}
		}
	
	
}
}

//int temp=0;
//while(a>1) {
//	for(int i=2;i<=a;i++) {
//		if(a%i==0) {
//			 temp=i;
//		    while(i>9) {
//		    	int sum=0;
//		    	while(i!=0) {
//		    		int r=i%10;
//		    		sum=sum+r;
//		    		i=i/10;	    		
//		    	}
//		    	i=sum;
//		    }
//		    System.out.println(i);
//		    a=a/temp;
//		    break;
//		}
//
//	}
