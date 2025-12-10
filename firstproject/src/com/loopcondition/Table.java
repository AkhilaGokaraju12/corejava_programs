package com.loopcondition;

import java.util.Scanner;

public class Table {
static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		table();

	}

static void table() {
	System.out.println("enter a table number");
	int a=s.nextInt();
	System.out.println("enter a table up to which number");
	int n=s.nextInt();
	for(int i=1;i<=n;i++) {
		System.out.println(a +"*"+ i + "=" + a*i );
	}
}
}
