package com.loopcondition2;

import java.util.Scanner;

public class Armstrong {
static Scanner s=new Scanner(System.in);

	public static void main(String[] args) {
		int i=1000;
		while(i<=2000) {
	//for(int i=1000;i<=2000;i++) {
		armstrong(i);
		i++;
	}

	}
static void armstrong(int n) {
	int temp=n;
	int n1=n;
	int r=0;
	int r1=0;
	int c=0;
	int sum=0;
	while(n!=0) {
		r=n%10;
		c++;	
		n=n/10;
	}
while(n1!=0) {
	r1=n1%10;
	int p=1;
	for(int i=1;i<=c;i++) {
		p=p*r1;	
	}
    sum=sum+p;
    n1=n1/10;
}
if(sum==temp) {
	System.out.println(sum);
}
}
}
