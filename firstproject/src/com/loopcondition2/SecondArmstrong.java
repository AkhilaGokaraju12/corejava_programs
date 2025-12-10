package com.loopcondition2;

import java.util.Scanner;

public class SecondArmstrong {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
 int n=s.nextInt();
	armstrong(n);

}
static void armstrong(int n ) {
	int temp=n;
	int sum=0;
	String s=Integer.toString(n);
int dc=s.length();
//System.out.println(dc);	
	while(n!=0) {
		int r=n%10;
		sum=sum+(int)Math.pow(r, dc);
		n=n/10;		
	}
	System.out.println(sum);
}
}
