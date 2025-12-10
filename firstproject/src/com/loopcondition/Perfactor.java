package com.loopcondition;

public class Perfactor {

	public static void main(String[] args) {
		int f=0;
		int c=0;
		
	for(int i=1;i<=100;i++) {
		if(perfect(i)) {
			c++;
	if(c==2) {
		f=i;
		System.out.println("second number of perfect"+f);
	}
			}
		}
	System.out.println(f);
	
	int f1=1;
for(int i=1;i<=f;i++) {
	f1=f1*i;
}
System.out.println("factorial of number:"+f1);
	}
	
static boolean perfect(int n) {
	int sum=0;
	boolean status;
	for(int i=1;i<n;i++) {
		if(n%i==0) {
			sum=sum+i;
		}
	}
	if(sum==n) {
		status=true;
	}
	else {
		status=false;
	}
	return status;
}
}
