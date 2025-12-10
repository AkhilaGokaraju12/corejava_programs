package com.arrays;

public class CountArray {

	public static void main(String[] args) {
	int[] a= {122,123,256,342};
   int count=0;
   for(int arr:a) {
	   while(arr!=0) {
		   int r=arr%10;
		   if(r==2) {
		   count++;
		   }
		   arr=arr/10;
	   }
   }
System.out.println(count);
	}

}
