package com.arrays;

public class NumberReverse {

	public static void main(String[] args) {
	int []a= {12,13,120,56};

	for(int i=0;i<a.length;i++) {
		String rev=" ";
		while(a[i]!=0) {
			//rev=rev+Integer.toString(a[i]%10);
			String s=Integer.toString(a[i]%10);
			rev=rev+s;
			a[i]=a[i]/10;
		}
	System.out.println(rev);
	    	 
	}
	}
}
