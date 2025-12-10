package com.loopcondition2;

public class PriPalindrome {

	public static void main(String[] args) {
	for(int i=1;i<=200;i++) {
		if(prime(i) && palindrome(i)){
			System.out.println(i);
		}
	}

	}
static boolean prime(int n) {
	boolean b=true;
	if(n<=1) {
		b=false;
	}
	for(int i=2;i<n;i++) {
		if(n%i==0) {
			b=false;
		}
	}
	
	return b;
}
static boolean palindrome(int n) {
   boolean b=false;
	int temp=n;
	int sum=0;
	while(n!=0) {
		int r=n%10;
		sum=(sum*10)+r;
		n=n/10;	
	}
if(sum==temp) {
b=true;
}
return b;
}
}
