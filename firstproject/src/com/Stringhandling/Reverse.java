package com.Stringhandling;

import java.util.Scanner;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

public class Reverse {
	 static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("main method");
		System.out.println("enter a String");
String s=sc.nextLine();
String sr=how(s);
//System.out.println(sr);
if(s.equalsIgnoreCase(sr)) {
	System.out.println("palindrome");
}
else{
	System.out.println(" not palindrome");
		}
System.out.println(how(s));
	}
	static String how(String s) {
		String re="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
					re=c+re;
		}
		return re;
	}

	}


