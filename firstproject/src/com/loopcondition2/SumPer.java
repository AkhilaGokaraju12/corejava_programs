package com.loopcondition2;

import java.util.Scanner;

public class SumPer {
	static Scanner s=new Scanner(System.in);

	public static void main(String[] args) {
	int n=s.nextInt();
	int temp=n;
	int sum=0;
	while(n!=0) {
	    int r=n%10;
	    sum=sum+r;
	    n=n/10;
	}
     if(temp%sum==0) {
    	 System.out.println(" given is harshit");
     }
     else {
    	 System.out.println("not");
     }
	}

}
