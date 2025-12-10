package com.arrays;

public class StringBiggest {

	public static void main(String[] args) {
	String a[]= {"hello","super_saiyajin","skyfallgood","autonomusultrainstinct","goodafternoonghhh"};
	int max=0;
//	for(int i=0;i<a.length;i++) {
///int r=a[i].length();
//for(int j=0;j<a.length-1;j++) {
//	if(a[j].length()<a[j+1].length()) {
//		String temp=a[j];
//		a[j]=a[j+1];
//		a[j+1]=temp;
	//	}
//}	
//	}
//	int c=0;
//	for(String s:a) {
//		c++;
//		if(c==1) {
//		System.out.println(s);
//	}
//	}
	for(int i=0;i<a.length;i++) {
		if(a[i].length()>max) {
			max=a[i].length();
		}
	}
	for(int i=0;i<a.length;i++) {
		if(a[i].length()==max) {
			System.out.println(a[i]);
		}
	}
}
}