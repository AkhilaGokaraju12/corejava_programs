package com.Stringhandling;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
	String s="silent";
	String s1="listen";
char c[]=s.toCharArray();
char c1[]=s1.toCharArray();
Arrays.sort(c);
Arrays.sort(c1);

String str1=Arrays.toString(c);
String str2=Arrays.toString(c1);
System.out.println(str1);
System.out.println(str2);
if(str1.equals(str2)) {
	System.out.println("anagram");
}
else {
	System.out.println("not anagram");
}

	}

}
