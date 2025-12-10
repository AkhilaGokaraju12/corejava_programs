package com.loopcondition2;

public class Binary {

	public static void main(String[] args) {
		int n=27;
	int arr[]=new int[10];
	int r=0;
	int i=0;
	while(n!=0) {
		r=n%2;
		arr[i]=r;
		i++;
		n=n/2;
	}

for(int j=i-1;j>=0;j--) {
	System.out.print(arr[j]+" ");
}
	}

}
