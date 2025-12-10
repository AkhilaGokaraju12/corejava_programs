package com.loopcondition;

public class prime3Highest {
	public static void main(String[] args) {
		int c=0;
		int a=0;
		int hp=0;
	for(int i=100;i>=0;i--) {
		if(prime(i)) {
			c++;
			if(c==2)
      System.out.println(i);
 
		}	
	}
	}
static boolean prime(int n) {
	boolean b=true;
	if(n==1) {
		b=false;
	}
	for(int i=2;i<n;i++) {
		if(n%i==0) {
			b=false;
		}
	}
	return b;
}
	}


