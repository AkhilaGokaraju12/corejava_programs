package com.arrays;

import java.util.Scanner;

public class reverse {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
	
int n=s.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++) {
arr[i]=s.nextInt();
}
for(int i=n-1;i>=0;i--) {
System.out.println(arr[i]);
}
	}

}
