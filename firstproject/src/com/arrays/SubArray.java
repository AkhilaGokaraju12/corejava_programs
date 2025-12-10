package com.arrays;

import java.util.Arrays;

public class SubArray {

	public static void main(String[] args) {
int a[]= {19,4,10,1,4,20,3,10,5,10,15,5,13};
int t=33;
String s=Arrays.toString(a);
//for(int i=0;i<a.length;i++) {
//	for(int j=i+1;j<a.length;j++) {
//		for(int k=j+1;k<a.length;k++) {
//		if(a[i]+a[j]+a[k]==t) {	
//			System.out.println("["+a[i] +","+a[j]+","+a[k]+"]");
//		}
//		}
//	}
//}
for(int i=0;i<a.length-2;i++) {
	if((a[i]+a[i+1])+a[i+1+1]==t) {
		System.out.println("["+a[i]+","+a[i+1]+","+a[i+1+1]+"]");

	}
}
	}

}
