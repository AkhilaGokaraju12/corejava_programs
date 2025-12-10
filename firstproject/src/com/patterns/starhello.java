package com.patterns;

public class starhello {

	public static void main(String[] args) {
//		int a[][]=new int [5][5];
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a[i].length;j++) {
//				if(i==j || i+j==4) {
//					System.out.print("*");
//				}	
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
for(int i=0;i<5;i++) {
	for(int j=0;j<5;j++ ) {
		if(i==2 && j==2) {
			System.out.print("hello");
			continue;
		}
		if(i==j || i+j==4) {
			
			System.out.print("*");
		}

		else {
			System.out.print(" ");
		}
		
	}
	
	System.out.println();
	
}
	}

}
