package com.arrays;

public class BubbleSort {

	public static void main(String[] args) {
int a[]= {40,20,10,30,5,2};
for(int i=0;i<a.length;i++) {
	//boolean flag=false;
	for(int j=0;j<a.length-1-i;j++) {
		if(a[j]>a[j+1]) {
			int temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
			//flag=true;
		}

	}

//	if(!flag) {
//		break;
//	}
}

for(int a1:a) {
	System.out.println(a1);
}
	}

}
