package com.loopcondition2;

import java.util.Scanner;

public class Palindrome {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
	
int a=s.nextInt();
		show(a);
		}
	
	
	static void show(int n) {
	
		int temp=n;
		int p=0;
		int r=0;
		while(n!=0){
			 r=n%10;
			p=(p*10)+r;
			n=n/10;	
		}
if(temp==p)
	System.out.println("palindrome");

	else {
		System.out.println("not palindrome");
	}
}
}


