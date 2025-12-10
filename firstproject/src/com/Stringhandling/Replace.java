package com.Stringhandling;

public class Replace {

	public static void main(String[] args) {
String s="akhila 1123 ram";
//s=s.replace('a', 'u'); if do assign it impact next if not do just it based do orgiginal s
System.out.println(s.replace('a', 'u'));//string and char
System.out.println(s);
System.out.println(s.replaceAll("u","i"));
System.out.println(s.replaceAll("\\d","@"));
System.out.println(s.replaceAll("\\D","a"));
////last index
String s1="hello good afternoon";
System.out.println(s1.lastIndexOf('o'));//string char
System.out.println(s1.lastIndexOf("er"));
System.out.println(s1.lastIndexOf('o',10));
String t="akhila -234 hydre 8999";
System.out.println(t.replace("\\d","000"));
System.out.println("**************");
System.out.println(t.replaceAll("\\d","000"));
String d="          akhi   la         ";
System.out.println(d.trim());
System.out.println(d.replaceAll("\\s", ""));
	}

}
