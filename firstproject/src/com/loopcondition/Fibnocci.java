package com.loopcondition;

import java.util.Scanner;

public class Fibnocci {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		show();

	}

	static void show() {
		int n = s.nextInt();
		// int u=10;
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		n3 = n1 + n2;
		System.out.println(n1);
		System.out.println(n2);
		for (int i = 1;  n3<=n; i++) {//i<=n
		
			n3 = n1 + n2;
			if(n3>=n) {//
				break;//
			}//
			System.out.println(n3);
			n1 = n2;
			n2 = n3;

		}

	}
}
