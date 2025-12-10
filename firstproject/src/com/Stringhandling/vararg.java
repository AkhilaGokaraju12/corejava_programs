 package com.Stringhandling;

public class vararg {

	public static void main(String[] args) {
		String s[]= {"phani","chaitu","akhila"};
		String s1[]= {"phani","chaitu","akhila","amma","nanna"};
		how("@",s);
how("@",s1);
System.out.println("*************88");
how("@","phani","chaitu","akhila","amma","nanna");
how("@","phani","chaitu","akhila");
	}
static void how(String i,String ...a ) {
	for(String s:a) {
		System.out.println(s);

	}
}
}
