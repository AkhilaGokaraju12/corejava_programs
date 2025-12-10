package com.arrays;

public class palindrome {
	public static void main(String[] args) {
	int a[]={121,222,123};
	for(int i=0;i<a.length;i++) {
		if(a[i]==show(a[i])){
			System.out.println(a[i]);
		}
	}
	}
static int show(int n) {
	int sum=0;
	while(n!=0) {
		int r=n%10;
		 sum=(sum*10)+r;
		 n=n/10;
	}
  return sum;
}
}
