package com.Stringhandling;

public class SubStringExam {

	public static void main(String[] args) {
		int n=2;
		String s="akhila";

		String s1=s.substring(2);
		System.out.println(s1);
		for(int i=0;i<n;i++) {
		s1=s1+s.charAt(i);
		}
		System.out.println(s1);

	}

}
