package com.patterns;

import java.util.Scanner;

public class House {
	static Scanner s=new Scanner(System.in);

	public static void main(String[] args) {
int row=s.nextInt();
int col=s.nextInt();
for(int i=1;i<=col;i++) {
	System.out.print(" __");
}
System.out.println();
for(int i=1;i<=row;i++) {
System.out.print("|");

for(int j=1;j<=col;j++) {
	System.out.print("__|");
}
	System.out.println();
}
	}

}
