package com.loopcondition;

import java.util.Scanner;

public class WithOutLoop {
 static Scanner s=new Scanner(System.in);

	public static void main(String[] args) {
		
		show(1);
	}

	static void show(int i) {
	
		if (i <= 10) {
			System.out.println(i);
	i++;
			show(i); //or //i+1//++i
		}
	}
}

// for(int i=1;;i++) 
//{
//	System.out.println(i); 
//if(i==10) 
//	break;
//}
/// for single numbers check
//static int n=6;
//static int sum=0;
//public static void main(String[] args) {
//	show(1);
//	if(sum==n) {
//	System.out.println("perfect");
//	}
//	else
//		System.out.println("not perfect");
//		}
//
//static void show(int i) {
//	if(i<n) {
//		if(n%i==0) {
//		sum=sum+i;
//		}
//		show(i+1);
//	}
//}