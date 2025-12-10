package com.loopcondition2;


public class Allpal {

	public static void main(String[] args) {
		for(int n=11;n<=200;n++) {
		int temp=n;
		int p=0;
		int r=0;
		while(n!=0){
			 r=n%10;
			p=(p*10)+r;
			n=n/10;	
		}

	if(temp==p) {
	System.out.println(p);
	}
	n=temp;
		}		

	}

}

/////
//for(int i=11;i<=500;i++) {
//	if(show(i)) {
//		System.out.println(i);
//	}
//}
//
//
//}
//static boolean show(int n) {
//	boolean b=false;
//	int temp=n;
//	int p=0;
//	int r=0;
//	while(n!=0){
//		 r=n%10;
//		p=(p*10)+r;
//		n=n/10;	
//	}
//if(temp==p)
//b=true;
//
//return b;
//}
///
///
//for(int i=11;i<=500;i++) {
//	show(i);
//	}
//}
//
//
//static void show(int n) {
//
//	int temp=n;
//	int p=0;
//	int r=0;
//	while(n!=0){
//		 r=n%10;
//		p=(p*10)+r;
//		n=n/10;	
//	}
//if(temp==p)
//System.out.println(p);
//}