package com.loopcondition2;

import java.util.Scanner;

public class Neon {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
	int n=s.nextInt();
	int s=n*n;
	int r=0;
	int sum=0;
while(s!=0) {
	r=s%10;
	sum=sum+r;
	s=s/10;	
}
if(sum==n)
System.out.println("neon number");
else
	System.out.println("not neon number");
}
}
