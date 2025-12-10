package com.arrays;

import java.util.Arrays;

public class DuplicateArray {

	public static void main(String[] args) {
	int a[]= {4,2,7,2,9,4,7,3,3,3};
Arrays.sort(a);
String s=Arrays.toString(a);
System.out.println(s);
String f="";
//for(int i=0;i<a.length;i++) {
//int count=0;
//while(i<a.length-1 && a[i]==a[i+1]) {
//i++;
//	count++;
//}
//
//if(count>=1) {
//	System.out.println(a[i]+"-"+count);
//}
//}
//}
for(int i=0;i<a.length;i++) {
	int count=0;
	for(int j=0;j<a.length;j++) {
		if(a[i]==a[j])
			count++;
	}

	if(count<=2) {
		System.out.print(a[i]+" ");
		i++;
	}
	if(count==3) {
		System.out.print(a[i]+" ");
		i=i+2;
	}
}
	}

}
