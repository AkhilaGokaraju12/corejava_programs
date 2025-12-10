package com.arrays;

public class MaxMin {

	public static void main(String[] args) {
	int[] a= {90,5,78,43,21};
	int max=0;
	int min=9;
	for(int i=0;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
		}
		if(a[i]<min) {
			min=a[i];
		}
		
	}
//	for (int arr:a) {
//	if(arr>max) {
//		max=arr;
//	}
//	if(arr<min) {
//		min=arr;
////	}
//	
//}
System.out.println(max);
System.out.println(min);
	}

}
