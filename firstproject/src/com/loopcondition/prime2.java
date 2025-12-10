package com.loopcondition;

public class prime2 {

	public static void main(String[] args) {
		int c=0;
		for(int i=1;i<=100;i++) {
			if(prime(i)) {
				System.out.println(i);
				c++;
				if(c==5)
					break;
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


