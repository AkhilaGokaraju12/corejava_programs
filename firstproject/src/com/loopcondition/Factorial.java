package com.loopcondition;

import java.util.Scanner;

public class Factorial {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		findFactorial();

	}

	static void findFactorial() {
		System.out.println("enter a number");
		int n = s.nextInt();
		int f = 1;
		for (int i = 1; i <= n; i++) {
			f = f * i;

		}
		System.out.println(f);
	}
}
