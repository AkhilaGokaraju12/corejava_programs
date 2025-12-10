package com.Stringhandling;

public class Compare_Method_array {

	public static void main(String[] args) {
		String s="Akhila";
		byte[] b= {'A','k','h','i','l','a'};
		for(int c:b) {
			System.out.println(c);
		}
		System.out.println("***");
		byte []b1=s.getBytes();
		for(int c1:b1) {
			System.out.println(c1);
		}

	}

}
