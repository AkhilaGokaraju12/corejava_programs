package com.arrays;

public class AddTwo {

	public static void main(String[] args) {
int a[]= {10,20,30};
int b[]= {40,50,60};
int a1=a.length;
int b1=b.length;
int c[]=new int[a1+b1];
for(int i=0;i<a1;i++) {
	c[i]=a[i];
	c[b1+i]=b[i];
}
for(int i=0;i<c.length;i++) {
	System.out.println(c[i]);
}
	}

}
