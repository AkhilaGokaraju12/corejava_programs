package com.loopcondition2;

public class Magic {
	public static void main(String[] args) {
	int n=1729;
			;
	
	while(n>9) {
		int sum=0;
	while(n!=0) {
		int r=n%10;
		sum=sum+r;
		n=n/10;
	
	}
	n=sum;
	System.out.println(n);
	}
	if(n==1) {
		System.out.println("it is magic");	
	}
	
	else {
		System.out.println("not magic");
	}
//sum=n;
//if(n==1) {
//	System.out.println("it is magic number");
//}
//else {
//	System.out.println("not magic");
//}
	

}
}
