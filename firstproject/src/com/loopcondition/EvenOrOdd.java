package com.loopcondition;

import java.util.Scanner;

public class EvenOrOdd {
	static Scanner s=new Scanner(System.in);
public static void main(String[] args) {
	even();
	odd();
}
static void even() {
	System.out.println("enter a number for even");
int n=s.nextInt();
	for(int i=1;i<=n;i++) {
		if(i%2==0) {
			System.out.print(i+" ");
		}
	}
}
static void odd() {
	System.out.println();
	System.out.println("enter a number for odd");
	int n=s.nextInt();
	for(int i=1;i<=n;i++) {
		if(i%2!=0) {
			System.out.print(i+" ");
		}
	}
}

}
