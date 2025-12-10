package com.loopcondition;

import java.util.Scanner;

public class FWithOutFactorial {
	static Scanner s=new Scanner(System.in);

int n=s.nextInt();
	static int f=1;
	public static void main(String[] args) {
		FWithOutFactorial f2=new FWithOutFactorial();

	f2.show(1);
	
System.out.println(f);
	}
void show(int i) {

	if(i<=n) {
		f=f*i;
	show(i+1);
	}
}
}
