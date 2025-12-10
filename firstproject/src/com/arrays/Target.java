package com.arrays;

public class Target {

	public static void main(String[] args) {
int [] a= {1,2,2,3,4,5,6,7};
int t=4;
String s="";
String s1="hello world";
System.out.println(s1.contains("hello"));//true
for(int i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
			if(a[i]+a[j]==t) {
				if(s.contains(a[i]+" "+a[j])){
					continue;
				}
				else{
					s=s+a[i]+" "+a[j];			
				System.out.println(a[i]+" "+a[j]);
				}
			
			
		
		}
	}
}
//for(int i=0;i<a.length-1;i++) {
//	if((a[i]+a[i+1])==t) {
//		System.out.println(a[i]+" "+a[i+1]);
//
//	}
//}
	}

}
