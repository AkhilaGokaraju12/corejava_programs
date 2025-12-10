package com.loopcondition;

public class Maxmin {

	public static void main(String[] args) {
		int n=671832;
		int max=0;
		int min=9;
		while(n!=0) {
			int r=n%10;
			if(r>max) {
				max=r;
			}
			 if(r<min){
				min=r;
			}
			n=n/10;
		}
		System.out.println(max);
		System.out.println(min);

	}

}
