package com.loopcondition;

import java.util.Scanner;

public class PerfectNumberRange {
static Scanner s=new Scanner(System.in);


	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
		
		boolean  b=rangeP(i);
	     if(b) {
			System.out.println(i);
			}
		}
	}

static boolean rangeP(int n) {
	int sum=0;
	boolean status;
for (int i=1;i<n;i++) {
		if(n%i==0) {
			sum=sum+i;
		}
	}
if(sum==n) 
	status=true;
else
	status=false;
return status;
}
}
