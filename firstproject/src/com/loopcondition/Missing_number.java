package com.loopcondition;

public class Missing_number {

	public static void main(String[] args) {
		int a[]= {1,3,7};
		for(int j=a[0];j<=a[a.length-1];j++) {
		boolean flag=false;
		for(int s:a) {
			if(s==j) {
				flag=true;
			}
		}
		if(!flag) {
			System.out.println(j);
		}
		}
	}

}
