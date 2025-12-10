package com.java8Features;

import java.util.Optional;

public class optional2null {

	public static void main(String[] args) {
String[] s=new String[5];
s[4]="akhila";
s[1]="ram";
//System.out.println(s[0]);
//System.out.println(s[4]);
//for(String s1:s) {
//	System.out.println(s1.toUpperCase());
//}
for(String s1:s) {
	Optional<String> v=Optional.ofNullable(s1);
	System.out.println(v);
	if(v.isPresent()) {
		System.out.println(s1.toUpperCase());
	}
}
	}

}
