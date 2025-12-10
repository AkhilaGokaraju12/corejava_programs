package com.Stringhandling;

public class permutation {

	public static void main(String[] args) {
String s="abc";
char c[]=s.toCharArray();
for(int i=0;i<c.length;i++) {
	for(int j=0;j<c.length;j++) {
		for(int k=0;k<c.length;k++) {
			if(c[i]==c[j] || c[i]==c[k] || c[j]==c[k]|| c[k]==c[i]){
				continue;
			}

		System.out.println(""+c[i]+c[j]+c[k]);
	}
}
	}
}
}
