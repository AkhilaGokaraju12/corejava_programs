package com.loopcondition;

import java.util.Scanner;

public class Factor {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
	
show();
	}
static void show() {
	System.out.println("enter a number to know the factor of that number");
	int n=s.nextInt();
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
			System.out.print(i +" ");
		}
	}
	
}
}
