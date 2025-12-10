package com.loopcondition;

import java.util.Scanner;

public class Prime {
 
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("prime number");
//int a=s.nextInt();
//	prime(a);		
//}
//	static void prime(int n) {
//		int c=0;
//		for(int i=1;i<=n;i++) {
//			if(n%i==0) {
//				c++;
//			}
//		}
//		if(c==2) {
//			System.out.println("prime");
//		}
//		else {
//			System.out.println("not prime");
//		}
//	}
//}


for(int i=1;i<20;i++) {
	if(prime(i)) {
		System.out.println(i);
  }
 }	
}
	static boolean prime(int n) {
		
		if(n<=1) {
		return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
			return false;
	
			
							
			}
		}
		return true;

	}	

}

