package com.loopcondition;

public class Prime1 {

	public static void main(String[] args) {
		int c=0;
	
		for(int i=1;i<=100;i++) {
			if(prime(i)) {
				c++;
				if(c==5)
				System.out.println(i);
			}
		}

	}
static boolean prime(int n) {
	boolean status=true;
	if(n==1) {
		status=false;
	}
	for(int i=2;i<=n/2;i++) {
		if(n%i==0) {
			status=false;
		}
	}
	return status;
}
}
