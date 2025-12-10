package com.loopcondition;

public class CountOfFor {

	public static void main(String[] args) {
//		int n=1234;
//		int sum=0;
//		int c=0;
//	int i=1;
//	while(i<=n) {
//		int r=n%10;
//		if(r%2==0) {
//			c++;
//		}
//		else
//		{
//			sum=sum+r;
//		}
//		n=n/10;
//	}
//System.out.println("count:"+c);
//System.out.println("sum:"+sum);
	
int n=1234;
int sum=0;
int sum1=0;
int c=0;

   for(int i=1;i<=n;) {
	   int r=n%10;
	   if(r%2==0) {
		c++;
	   }
	   else {
		   sum=sum+r;
	   }
	   n=n/10;
	
}
 System.out.println("count:"+c);
 System.out.println("sum:"+sum);
 	 
}
	
}
