package com.loopcondition2;

public class Snippet {

	public static void main(String[] args) {
for(int i=1;i<=200;i++) {
	snappit(i);
}
}
	static void snappit(int n) {
		 int temp=n;
			while(n>9) {
				int r=0;
				int sum=0;
				while(n!=0) {
					r=n%10;
					sum=sum+r;
					n=n/10;
				}
		     n=sum;
			}
			if(n%7==0) {
				System.out.println(temp);
			}
	}
}
//		for(int n=)
//		int n=79;
//		int temp=n;
//		while(n>9) {
//			int r=0;
//			int sum=0;
//			while(n!=0) {
//				r=n%10;
//				sum=sum+r;
//				n=n/10;
//			}
//	     n=sum;
//		}
//		if(n%7==0) {
//			System.out.println(temp);
//		}
//}
//}

		 
		 
		 
		 
		 
