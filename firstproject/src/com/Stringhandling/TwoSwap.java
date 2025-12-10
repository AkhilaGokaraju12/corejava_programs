package com.Stringhandling;

public class TwoSwap {

	public static void main(String[] args) {
		String s="hello world";
		s=s.replace(" ","");
		String s1="";
		String s2="";
		System.out.println(s.length());

		for(int i=0;i<s.length();) {
		for(int j=0;j<2 && i<s.length();j++,i++) {
			s1=s1+s.charAt(i);

		}
		for(int k=0;k<2 && i<s.length();k++,i++ ){
			
			s2=s2+s.charAt(i);

		}

		}
		System.out.println(s1);
		System.out.println(s2);


	}

}
