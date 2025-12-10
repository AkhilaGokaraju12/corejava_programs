package com.loopcondition;

import java.util.Scanner;

public class EvenOdd {
static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
	countEven();

	}
static void  countEven() {
	
	int evencount=0;
	int oddcount=0;
	for(int i=1;i<=100;i++) {
		if(i%2==0) {
			evencount++;
		}
		else
			oddcount++;
	
	}
	System.out.println(evencount);
	System.out.println(oddcount);
	}
	

}
