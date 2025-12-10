package com.loopcondition;

public class WhileInn {

	public static void main(String[] args) {
		int n=89;
		while(n>9) {
			int i=csum(n);
			n=i;	
		}
		System.out.println(n);
			}
		    static int csum(int n) {
				int sum=0;
				while(n!=0) {
					int r=n%10;
					sum=sum+r;
					n=n/10;
				}
				return sum;
			}

		   


}
