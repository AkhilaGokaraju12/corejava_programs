package com.loopcondition2;

public class Noofpalindrome {


		public static void main(String[] args) {
			int c=0;
			for(int i=100;i<=200;i++) {
	if(palindrome(i)) {
		c++;
		if(c<=5)///up to 5 uget
			System.out.println(i);
		}
		}
		}
	static boolean palindrome(int n) {
		boolean b=false;;
		int temp=n;
		int sum=0;
		while(n!=0) {
			int r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum) {
			b=true;
		}
		return b;

	}

}
