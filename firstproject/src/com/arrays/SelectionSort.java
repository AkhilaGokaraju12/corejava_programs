package com.arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int a[]={40,20,10,30,5,2};
System.out.println(a);

how(a);
		for(int a1:a) {
			System.out.println(a1);
		}
	
	}
	static void how(int s[]) {
System.out.println(s);
		for(int i=0;i<s.length;i++) {
			int min=i;
			for(int j=i+1;j<s.length;j++) {
				if(s[j]<s[min]) {
					min=j;
				}
			}
			int temp=s[i];
			s[i]=s[min];
			s[min]=temp;
		
		}
	}

}
